package com.uisrael.clinica_veterinaria.service;

import java.util.List;

import com.uisrael.clinica_veterinaria.model.Cliente;


public interface IClienteService {
	 //método para traer a todas las personas
    //lectura
    public List<Cliente> getClientes();

    //alta
    public void saveCliente(Cliente cliente);

    //baja
    public void deleteCliente(Long id);

    //lectura de un solo objeto
    public Cliente findCliente(Long id);

    //edición/modificación
    public void editCliente(Cliente cliente);
}
