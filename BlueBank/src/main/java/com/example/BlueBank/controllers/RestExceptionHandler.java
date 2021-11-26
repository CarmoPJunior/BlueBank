package com.example.BlueBank.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.BlueBank.DTOExceptions.ErrorObject;
import com.example.BlueBank.DTOExceptions.ErrorResponse;
import com.example.BlueBank.exceptions.ClienteJaExisteException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.exceptions.ContaBloqueadaException;
import com.example.BlueBank.exceptions.ContaNaoEncontradaException;
import com.example.BlueBank.exceptions.ContatoNaoEncontradoException;
import com.example.BlueBank.exceptions.SaldoInsuficienteException;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
	
	 	@Override
	 	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
	        List<ErrorObject> errors = getErrors(ex);
	        ErrorResponse errorResponse = getErrorResponse(ex, status, errors);
	        return new ResponseEntity<>(errorResponse, status);
	    }

	    private ErrorResponse getErrorResponse(MethodArgumentNotValidException ex, HttpStatus status, List<ErrorObject> errors) {
	        return new ErrorResponse("Requisição possui campos inválidos", status.value(),
	                status.getReasonPhrase(), ex.getBindingResult().getObjectName(),new Date(), errors);
	    }

	    private List<ErrorObject> getErrors(MethodArgumentNotValidException ex) {
	        return ex.getBindingResult().getFieldErrors().stream()
	                .map(error -> new ErrorObject(error.getDefaultMessage(), error.getField(), error.getRejectedValue()))
	                .collect(Collectors.toList());
	    }
	    
	    @ExceptionHandler({SaldoInsuficienteException.class, ContaBloqueadaException.class, ClienteJaExisteException.class})
		public ResponseEntity<ErrorResponse> handleBadRequestException(Exception ex, WebRequest request) {
			
			ErrorResponse message = new ErrorResponse(
					ex.getMessage(),
					HttpStatus.UNAUTHORIZED.value(),
					HttpStatus.UNAUTHORIZED.getReasonPhrase(),
					null,
					new Date(),
					null);

			return new ResponseEntity<ErrorResponse>(message, HttpStatus.UNAUTHORIZED);
		}
		
		@ExceptionHandler({ContaNaoEncontradaException.class, ContatoNaoEncontradoException.class, ClienteNaoEncontradaException.class})

		public ResponseEntity<ErrorResponse> handleNotFoundException(Exception ex, WebRequest request) {
			
			ErrorResponse message = new ErrorResponse(
					ex.getMessage(),
					HttpStatus.NOT_FOUND.value(),
					HttpStatus.NOT_FOUND.getReasonPhrase(),
					null,
					new Date(),
					null);

			return new ResponseEntity<ErrorResponse>(message, HttpStatus.BAD_REQUEST);
		}

	

}
