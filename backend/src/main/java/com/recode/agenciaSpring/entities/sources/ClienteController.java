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

import com.recode.agenciaSpring.entities.Cliente;
import com.recode.agenciaSpring.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	ClienteService service;	
	
	@GetMapping
	public List<Cliente> findAll() {
		List<Cliente> result = service.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        Optional<Cliente> clienteId = service.findById(id); 
        return clienteId;
    }
		
	@PostMapping    
    public Cliente create(@RequestBody Cliente cliente) {
        return service.create(cliente);
    }	
	
	
	@DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);        
	}
	
	
}
