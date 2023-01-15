
package com.Portafolio.Matias.Repositorio;

import com.Portafolio.Matias.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matiasxds
 */


@Repository
public interface IPersonaRepositorio extends  JpaRepository<Persona,Long>   {
    
}
