/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portafolio.Matias.Repositorio;

import com.Portafolio.Matias.Entidad.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matiasxds
 */
@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Integer> {
     public Optional<Experiencia> findByNombreEx(String nombreEx);
    public boolean existsByNombreEx(String nombreEx);
}
