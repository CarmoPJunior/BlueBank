package com.example.BlueBank.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BlueBank.DTO.ContaDTO;
import com.example.BlueBank.models.Conta;
import com.example.BlueBank.models.Transacoes;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

	@Query("select t from Transacoes t")
	Page<Transacoes> findAllByConta(ContaDTO conta, Pageable pageable);

	@Query("select t from Transacoes t WHERE t.contaOrigem.id = :conta or t.contaDestino.id = :conta")
	Page<Transacoes> findAllByConta(@Param("conta") Integer conta, Pageable pageable);

	@Query("select c from Conta c WHERE c.cliente.id = :cliente")
	Conta findByClienteConta(@Param("cliente") Integer idCliente);

}
