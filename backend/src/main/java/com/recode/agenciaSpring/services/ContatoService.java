package com.recode.agenciaSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.agenciaSpring.entities.Contato;
import com.recode.agenciaSpring.repositories.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	ContatoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Contato> findAll() {
		return repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Optional<Contato> findById(Long id) {
		return repository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Contato create(Contato contato) {
		return repository.save(contato);
	}	
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
