package com.uisrael.clinica_veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.clinica_veterinaria.model.Cliente;
import com.uisrael.clinica_veterinaria.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService{

    @Autowired
   private IClienteRepository repoCliente;

   @Override
   public List<Cliente> getClientes() {
       List<Cliente> listaClientes = repoCliente.findAll();
       return listaClientes;
   }

   @Override
   public void saveCliente(Cliente cliente) {
	   repoCliente.save(cliente);
	   
   }

   @Override
   public void deleteCliente(Long id) {
	   repoCliente.deleteById(id);
   }

   @Override
   public Cliente findCliente(Long id) {
       return repoCliente.findById(id).orElse(null);
   }

   @Override
   public void editCliente(Cliente cliente) {
       this.saveCliente(cliente);
   }
   
}
