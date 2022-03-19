package com.recode.agenciaSpring.entities.sources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agenciaSpring.entities.Contato;
import com.recode.agenciaSpring.services.ContatoService;

@RequestMapping(value = "/contatos")
@RestController
public class ContatoController {

	@Autowired
	ContatoService service;
	
	public List<Contato> findAll() {
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
    public Optional<Contato> findById(@PathVariable Long id) {
        Optional<Contato> contatoId = service.findById(id); 
        return contatoId;
    }
		
	@PostMapping    
    public Contato create(@RequestBody Contato contato) {
        return service.create(contato);
    }	
	
	
	@DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);        
	}
}
