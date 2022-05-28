package com.yaceszen.ap.services;

import com.yaceszen.ap.exception.UserNotFoundException;
import com.yaceszen.ap.models.Skills;
import com.yaceszen.ap.models.Usuario;
import com.yaceszen.ap.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    public Skills agregarSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public List<Skills> buscarSkills(){
        return skillsRepo.findAll();
    }
    public Skills editarSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public void eliminarSkills(Long id){
        skillsRepo.deleteById(id);
    }

    /*
    public Skills buscarSkillsId(Long id){
        return skillsRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
    */
}
