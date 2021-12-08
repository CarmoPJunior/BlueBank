package com.example.BlueBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlueBank.models.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
