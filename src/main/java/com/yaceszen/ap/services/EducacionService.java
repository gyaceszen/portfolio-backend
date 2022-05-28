package com.yaceszen.ap.services;
import com.yaceszen.ap.models.Educacion;
import com.yaceszen.ap.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    public Educacion agregarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducacion(){
        return educacionRepo.findAll();
    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void eliminarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}
