/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portafolio.Matias.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Matiasxds
 */
public class DtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descripcionEd;

    
    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }
    
    
    
    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEd, String descripcionEd) {
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
    }

    
}
