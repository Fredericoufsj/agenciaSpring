package com.recode.agenciaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.agenciaSpring.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
