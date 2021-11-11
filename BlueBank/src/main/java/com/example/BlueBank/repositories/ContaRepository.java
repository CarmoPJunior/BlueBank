package com.example.BlueBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.BlueBank.models.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
