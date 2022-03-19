package com.recode.agenciaSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.agenciaSpring.entities.Destino;
import com.recode.agenciaSpring.repositories.DestinoRepository;

@Service
public class DestinoService {
	
	@Autowired
	DestinoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Destino> findAll() {
		List<Destino> destino = repository.findAll();
		return destino;
	}
	
	@Transactional(readOnly = true)
	public Optional<Destino> findById(Long id) {
		return repository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Destino create(Destino destino) {
		return repository.save(destino);
	}

	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
