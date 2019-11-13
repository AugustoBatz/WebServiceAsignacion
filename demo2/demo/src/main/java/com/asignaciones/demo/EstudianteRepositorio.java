/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignaciones.demo;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author sys515
 */
public interface EstudianteRepositorio extends Repository<Estudiante,Integer>{
    List<Estudiante>findAll();
    Estudiante save(Estudiante e);
   /*Estudiante finOne(int id);
    
    void delete(Estudiante e);*/
}
