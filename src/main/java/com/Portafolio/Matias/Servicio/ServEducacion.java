/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Servicio;

import com.Portafolio.Matias.Entidad.Educacion;
import com.Portafolio.Matias.Repositorio.RepoEducacion;
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
public class ServEducacion {
    @Autowired
    RepoEducacion repoEducacion;
     
    public List<Educacion> list(){
        return repoEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return repoEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNombreEd(String nombreEd){
        return repoEducacion.findByNombreEd(nombreEd);
    }
    
    public void save(Educacion educacion){
        repoEducacion.save(educacion);
    }
    
    public void delete(int id){
        repoEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repoEducacion.existsById(id);
    }
    
    public boolean existsByNombreEd(String nombreEd){
        return repoEducacion.existsByNombreEd(nombreEd);
    }
}

