package com.recode.agenciaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recode.agenciaSpring.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

	Contato findById(long id);
	
}
