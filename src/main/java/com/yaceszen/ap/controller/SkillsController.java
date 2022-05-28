package com.yaceszen.ap.controller;

import com.yaceszen.ap.models.Skills;
import com.yaceszen.ap.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }

    @PutMapping("/editar")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
        Skills updateSkills = skillsService.editarSkills(skills);
        return new ResponseEntity<>(updateSkills,HttpStatus.OK);
    }
    @GetMapping("/todas")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills=skillsService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkills= skillsService.agregarSkills(skills);
        return new ResponseEntity<>(nuevaSkills,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.eliminarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
