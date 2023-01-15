
package com.Portafolio.Matias.Servicio;

import com.Portafolio.Matias.Entidad.Persona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Portafolio.Matias.Interface.IPersonaServicio;
import com.Portafolio.Matias.Repositorio.IPersonaRepositorio;

/**
 *
 * @author Matiasxds
 */

@Service
public class ImpPersonaServicio implements IPersonaServicio{

    @Autowired IPersonaRepositorio iPersonaRepositorio;
    
            
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = iPersonaRepositorio.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       iPersonaRepositorio.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepositorio.findById(id).orElse(null);
        return persona;
    }
    
}
