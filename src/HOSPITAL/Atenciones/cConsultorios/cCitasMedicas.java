/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Atenciones.cConsultorios;

import HOSPITAL.Tipos_de_empleados.cMedico;

/**
 *
 * @author wedee
 */
public class cCitasMedicas {
    
    public String especialidad;
    public String fecha;
    public String hora;
    public String medico;
    public String consultorio;
    public String modalidad;
    public String estado;

    public cCitasMedicas(String especialidad, String fecha,String hora, String medico, String consultorio, String modalidad, String estado) {
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.hora=hora;
        this.medico = medico;
        this.consultorio = consultorio;
        this.modalidad = modalidad;
        this.estado=estado;
    }

    public cCitasMedicas(String fecha, String hora, String medico, String consultorio, String modalidad, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void getMedico(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
        
}
