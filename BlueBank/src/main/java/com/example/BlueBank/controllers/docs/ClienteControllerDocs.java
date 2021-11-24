package com.example.BlueBank.controllers.docs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.BlueBank.DTO.ClienteDTO;
import com.example.BlueBank.exceptions.ClienteNaoEncontradaException;

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

//    @ApiOperation(value = "Returns a list of all beers registered in the system")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "List of all beers registered in the system"),
//    })
//    List<BeerDTO> listBeers();
	

}
