/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Seguridad.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Matiasxds
 */
public class LoginUsuario {
    @NotBlank
    private String alias;
    @NotBlank
    private String Password;
    
    
    //Getters and setters

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


    
}
