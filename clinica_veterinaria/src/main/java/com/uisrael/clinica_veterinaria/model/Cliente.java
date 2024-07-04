package com.uisrael.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
	@Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_cliente;
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;

    public Cliente() {
    }

    public Cliente(Long id_cliente, String ci, String nombre, String apellido, String celular) {
        this.id_cliente = id_cliente;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

}
