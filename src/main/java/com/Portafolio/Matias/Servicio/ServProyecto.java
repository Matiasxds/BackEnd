/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Servicio;

import com.Portafolio.Matias.Entidad.Proyecto;
import com.Portafolio.Matias.Repositorio.RepoProyecto;
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
public class ServProyecto {
    
     @Autowired 
    RepoProyecto repoProyecto;
     public List<Proyecto> list(){
         return repoProyecto.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return repoProyecto.findById(id);
     }
     
     public Optional<Proyecto> getByNombre(String nombre){
         return repoProyecto.findByNombre(nombre);
     }
     
     public void save(Proyecto proyecto){
         repoProyecto.save(proyecto);
     }
     
     public void delete(int id){
         repoProyecto.deleteById(id);
     }
     
     public boolean existsById(int id){
         return repoProyecto.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return repoProyecto.existsByNombre(nombre);
     }
    
}
    