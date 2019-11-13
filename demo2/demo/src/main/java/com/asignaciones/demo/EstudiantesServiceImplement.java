/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignaciones.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sys515
 */
@Service
public class EstudiantesServiceImplement implements EstudianteService{
    @Autowired
    private EstudianteRepositorio repositorio;
    
   
    @Override
    public List<Estudiante> listar() {
       return repositorio.findAll();
    }

    @Override
    public Estudiante add(Estudiante e) {
        return repositorio.save(e);
    }

   
    
}
