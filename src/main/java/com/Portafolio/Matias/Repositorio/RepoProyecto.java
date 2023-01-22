/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portafolio.Matias.Repositorio;

import com.Portafolio.Matias.Entidad.Persona;
import com.Portafolio.Matias.Entidad.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matiasxds
 */

@Repository

public interface RepoProyecto extends  JpaRepository<Proyecto,Integer> {
       public Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

    public void save(Persona persona);

}
