/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Seguridad.Servicio;

import com.Portafolio.Matias.Seguridad.entidad.Rol;
import com.Portafolio.Matias.Seguridad.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Portafolio.Matias.Seguridad.Repositorio.iRolRepositorio;

/**
 *
 * @author Matiasxds
 */


@Service
@Transactional
public class RolServicio {
   @Autowired 
   iRolRepositorio irolRepositorio;
   
 public  Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return irolRepositorio.findByRolNombre(rolNombre);
 }

public void save(Rol rol){
    irolRepositorio.save(rol);
}


}
