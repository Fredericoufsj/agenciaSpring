package com.recode.agenciaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recode.agenciaSpring.entities.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {
	Destino findById(long id);

}
