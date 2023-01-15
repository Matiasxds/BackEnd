
package com.Portafolio.Matias.Interface;

import com.Portafolio.Matias.Entidad.Persona;
import java.util.List;

/**
 *
 * @author Matiasxds
 */
public interface IPersonaServicio {
    
    //Trae una lista de personas
    public List<Persona> getPersona ();
    
    //Guarda un objeto de tipo Persona
    public void savePersona (Persona persona);
   
    //Elimina un objeto pero lo buscamos por ID
    public void deletePersona (Long id);
    
    //Busca una persona por ID
    public Persona findPersona (Long id);
}
