/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignaciones.demo;

import javax.persistence.*;
/**
 *
 * @author sys515
 */
@Entity
@Table(name  = "estudiante")
public class Estudiante {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column 
    private String direccion;
    
    //Asignar y obtener ID
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    //Asignar Nombre y obtener nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //Asignar Apellid y obtener Apellido
    public String getApelido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    //Asignar Direccion y obtener Direccion
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    
    
    
    
}

