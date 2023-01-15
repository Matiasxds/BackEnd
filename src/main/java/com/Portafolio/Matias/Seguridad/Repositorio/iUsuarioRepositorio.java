/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portafolio.Matias.Seguridad.Repositorio;

import com.Portafolio.Matias.Seguridad.entidad.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matiasxds
 */


@Repository
public interface iUsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByalias(String alias);
boolean existsByalias(String alias);
boolean existsByEmail(String Email);
}
