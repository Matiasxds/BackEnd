
package com.Portafolio.Matias.Controlador;

import com.Portafolio.Matias.Entidad.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Portafolio.Matias.Interface.IPersonaServicio;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author Matiasxds
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControlador {
    @Autowired IPersonaServicio ipersonaServicio;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaServicio.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaServicio.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaServicio.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("img") String nuevoImg){
        Persona persona = ipersonaServicio.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        ipersonaServicio.savePersona(persona);
        return persona;
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaServicio.findPersona((long)1);
    }
   
}
