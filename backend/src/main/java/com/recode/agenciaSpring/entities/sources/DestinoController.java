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

import com.recode.agenciaSpring.entities.Destino;
import com.recode.agenciaSpring.services.DestinoService;

@RestController
@RequestMapping(value = "/destinos")
public class DestinoController {
	
	@Autowired	
	DestinoService service;
	
	@GetMapping
	public List<Destino> findAll(){
		List<Destino> result = service.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
    public Optional<Destino> findById(@PathVariable Long id) {
        Optional<Destino> destinoId = service.findById(id); 
        return destinoId;
    }
		
	@PostMapping    
    public Destino create(@RequestBody Destino destino) {
        return service.create(destino);
    }	
	
	
	@DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);        
	}
	
}
