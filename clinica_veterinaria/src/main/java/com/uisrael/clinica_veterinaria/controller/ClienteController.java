package com.uisrael.clinica_veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.clinica_veterinaria.model.Cliente;
import com.uisrael.clinica_veterinaria.service.IClienteService;

@RestController
public class ClienteController {
	  @Autowired
	    private IClienteService clienteServi;
	     
	      @GetMapping ("/cliente/traer")
	    public List<Cliente> getCliente() {
	        
	        return clienteServi.getClientes();
	    }
	    
	    @PostMapping ("/cliente/crear")
	    public String savePersona (@RequestBody Cliente cliente) {
	    	clienteServi.saveCliente(cliente);
	        
	        return "La persona fue creada correctamente";
	    }
	    
	    @DeleteMapping ("/cliente/borrar/{id}")
	    public String deletePersona(@PathVariable Long id) {
	    	clienteServi.deleteCliente(id);
	        return "La persona fue eliminada correctamente";
	    }
	    
	    @PutMapping ("/cliente/editar")
	    public Cliente editCliente(@RequestBody Cliente cliente) {
	    	clienteServi.editCliente(cliente);
	        
	        return clienteServi.findCliente(cliente.getId_cliente());
	    }
}
