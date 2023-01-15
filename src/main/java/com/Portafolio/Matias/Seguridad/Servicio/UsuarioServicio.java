/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Seguridad.Servicio;

import com.Portafolio.Matias.Seguridad.entidad.Usuario;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Portafolio.Matias.Seguridad.Repositorio.iUsuarioRepositorio;

/**
 *
 * @author Matiasxds
 */



@Service
@Transactional
public class UsuarioServicio {
    @Autowired 
    iUsuarioRepositorio iusuarioRepositorio;
    
    
    public  Optional<Usuario> getByalias(String alias){
        return iusuarioRepositorio.findByalias(alias);
    }
    
    
    
    
    public boolean  existsbyalias(String alias){
        return iusuarioRepositorio.existsByalias(alias);
    }
    
     public boolean  existsbyEmail(String Email){
        return iusuarioRepositorio.existsByEmail(Email);
    }
     
     
     public void save (Usuario usuario){
         iusuarioRepositorio.save(usuario);
     }

  
}
