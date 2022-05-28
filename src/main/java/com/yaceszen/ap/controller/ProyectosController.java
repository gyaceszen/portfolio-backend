package com.yaceszen.ap.controller;

import com.yaceszen.ap.models.Proyectos;
import com.yaceszen.ap.services.ProyectosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService){
        this.proyectosService = proyectosService;
    }

    @PutMapping("/editar")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyectos){
        Proyectos updateProyectos = proyectosService.editarProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    @GetMapping("/todos")
    public ResponseEntity<List<Proyectos>> obtenerProyectos(){
        List<Proyectos> proyectos= proyectosService.buscarProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<Proyectos> crearProyectos(@RequestBody Proyectos proyectos){
        Proyectos nuevoProyecto = proyectosService.agregarProyectos(proyectos);
        return new ResponseEntity<>(nuevoProyecto,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id){
        proyectosService.eliminarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
