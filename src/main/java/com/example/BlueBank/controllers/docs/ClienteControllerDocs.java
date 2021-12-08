package com.example.BlueBank.controllers.docs;

import java.util.List;
import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.exceptions.ClienteJaExisteException;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;
import com.example.BlueBank.models.Cliente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("Gerencia os Clientes")
public interface  ClienteControllerDocs {
	
	
	
	@ApiOperation(value = "Retorna um cliente, passando o id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cliente encontrado!"),
            @ApiResponse(code = 404, message = "Cliente não encontrado!")
    })
	ResponseEntity<ClienteDTO> findById(@PathVariable Integer id) throws ClienteNaoEncontradaException;

    @ApiOperation(value = "Retorna todos os clientes cadastrados.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Lista todos os clientes cadastrados."),
    })
    ResponseEntity<Page<ClienteDTO>> findAll(Pageable page);
    
    @ApiOperation(value = "Insere um cliente.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cliente inserido com sucesso!"),  
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos!")
    })
    ResponseEntity<ClienteDTO> create(@RequestBody @Valid Cliente obj) throws ClienteJaExisteException;
    
    @ApiOperation(value = "Atualiza um cliente.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cliente atualizado com sucesso!"),  
            @ApiResponse(code = 400, message = "Requisição possui campos inválidos!"),
            @ApiResponse(code = 404, message = "Cliente não encontrado!")
    })
    ResponseEntity<ClienteDTO> update(@PathVariable Integer id, @RequestBody @Valid ClienteDTO obj) throws ClienteNaoEncontradaException;
	
        
    @ApiOperation(value = "Deleta um cliente.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cliente deletado com sucesso!"),  
            @ApiResponse(code = 404, message = "Cliente não encontrado!")
    })
    ResponseEntity<Void> delete(@PathVariable Integer id) throws ClienteNaoEncontradaException; 
}
