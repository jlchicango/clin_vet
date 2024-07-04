
package com.uisrael.clinica_veterinaria.service;

import java.util.List;

import com.uisrael.clinica_veterinaria.model.Duenio;


public interface IDuenioService {
    
    //método para traer a todas las personas
    //lectura
    public List<Duenio> getDuenios();

    //alta
    public void saveDuenio(Duenio duenio);

    //baja
    public void deleteDuenio(Long id);

    //lectura de un solo objeto
    public Duenio findDuenio(Long id);

    //edición/modificación
    public void editDuenio (Duenio duenio);
    
}
