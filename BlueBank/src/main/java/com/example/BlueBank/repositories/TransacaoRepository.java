package com.example.BlueBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.BlueBank.models.Transacoes;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacoes, Integer>{

}
