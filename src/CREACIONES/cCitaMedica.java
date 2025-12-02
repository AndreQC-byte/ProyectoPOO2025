/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CREACIONES;

import HOSPITAL.Tipos_de_empleados.cMedico;

/**
 *
 * @author wedee
 */
public class cCitaMedica {
    
    public String especialidad;
    public String fecha;
    public String medico;
    public String consultorio;
    public String modalidad;

    public cCitaMedica(String especialidad, String fecha, String medico, String consultorio, String modalidad) {
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.medico = medico;
        this.consultorio = consultorio;
        this.modalidad = modalidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
    
    
    
        
}
