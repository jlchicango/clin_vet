package com.uisrael.clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.clinica_veterinaria.model.Duenio;

@Repository
public interface IDuenioRepository extends JpaRepository <Duenio, Long>{
    
}
