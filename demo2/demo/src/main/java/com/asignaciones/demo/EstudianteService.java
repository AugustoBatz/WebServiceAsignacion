/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignaciones.demo;

import java.util.List;

/**
 *
 * @author sys515
 */
public interface EstudianteService {
    List<Estudiante>listar(); 
    Estudiante add(Estudiante e);
    
    /*Estudiante listarId(int id);
    Estudiante edit(Estudiante e);
    Estudiante delete(int id);*/
    
}
