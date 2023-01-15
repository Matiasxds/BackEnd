/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Seguridad.Servicio;

import com.Portafolio.Matias.Seguridad.entidad.Usuario;
import com.Portafolio.Matias.Seguridad.entidad.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matiasxds
 */

@Service

public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioServicio usuarioServicio;

    @Override
    public UserDetails loadUserByUsername(String alias) throws UsernameNotFoundException {
       Usuario usuario = usuarioServicio.getByalias(alias).get();
       return  UsuarioPrincipal.build(usuario);
    }
}
