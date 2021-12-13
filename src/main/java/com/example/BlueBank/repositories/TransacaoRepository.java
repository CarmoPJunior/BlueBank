package com.example.BlueBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlueBank.models.Transacoes;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacoes, Integer> {

	// @Query("select t from Transacoes t WHERE t.tipoTransacao = :tipoTransacao")

	// @Query(value="select t.* from Transacoes t WHERE t.tipo_transacao =
	// :tipoTransacao",nativeQuery=true)
	// List<Transacoes> findAllByTipo(@Param("tipoTransacao") Integer
	// tipoTransacao);

}
