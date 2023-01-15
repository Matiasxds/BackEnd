/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Servicio;

import com.Portafolio.Matias.Entidad.Experiencia;
import com.Portafolio.Matias.Repositorio.ExperienciaRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matiasxds
 */
@Service
@Transactional
public class ServExperiencia {
     @Autowired
     ExperienciaRepo ExperienciaRepo;
     
     public List<Experiencia> list(){
         return ExperienciaRepo.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return ExperienciaRepo.findById(id);
     }
     
     public Optional<Experiencia> getByNombreEx(String nombreEx){
         return ExperienciaRepo.findByNombreEx(nombreEx);
     }
     
     public void save(Experiencia expe){
         ExperienciaRepo.save(expe);
     }
     
     public void delete(int id){
         ExperienciaRepo.deleteById(id);
     }
     
     public boolean existsById(int id){
         return ExperienciaRepo.existsById(id);
     }
     
     public boolean existsByNombreEx(String nombreEx){
         return ExperienciaRepo.existsByNombreEx(nombreEx);
     }
}
