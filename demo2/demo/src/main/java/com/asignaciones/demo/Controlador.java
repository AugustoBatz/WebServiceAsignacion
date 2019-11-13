/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignaciones.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sys515
 */
// CrossOrigin(origins = "http://localhost",maxAge = 3600)
@RestController
@RequestMapping({ "/estudiantes" })
public class Controlador {
    @Autowired
    EstudianteService service;

    @GetMapping("/listar")
    public List<Estudiante> listar() {
        return service.listar();
    }

    @PostMapping
    public Map<String, Object> agregar(@RequestBody Estudiante e) {
        service.add(e);
        HashMap<String, Object> response = new HashMap<>();
        HashMap<String, String> estudiante = new HashMap<>();
        estudiante.put("direccion", e.getDireccion());
        estudiante.put("apellido", e.getApelido());
        estudiante.put("nombre", e.getNombre());
        response.put("response", "oks");
        response.put("estudiante", estudiante);
        return response;

    }

}
