/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portafolio.Matias.Seguridad.Repositorio;

import com.Portafolio.Matias.Seguridad.entidad.Rol;
import com.Portafolio.Matias.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matiasxds
 */

@Repository
public interface iRolRepositorio extends JpaRepository<Rol, Integer>{
  Optional<Rol> findByRolNombre(RolNombre rolNombre);    
}
