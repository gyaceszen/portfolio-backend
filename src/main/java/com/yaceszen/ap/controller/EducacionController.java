package com.yaceszen.ap.controller;

import com.yaceszen.ap.models.Educacion;
import com.yaceszen.ap.models.Proyectos;
import com.yaceszen.ap.services.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService){
        this.educacionService = educacionService;
    }

    @PutMapping("/editar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion = educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    @GetMapping("/todas")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educacion = educacionService.buscarEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @PostMapping("/nueva")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionService.agregarEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionService.eliminarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
