/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author User
 */

   
public abstract class cPersona {
    protected String dni;
    protected String nombres;
    protected String apellidos;
    protected String fechaNacimiento; 
    protected String sexo;
    protected String datosContacto;

    // Constructor
    public cPersona(String dni, String nombres, String apellidos, String fechaNacimiento, String sexo, String datosContacto) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.datosContacto = datosContacto;
    }

    
    public abstract String getTipoPersona();

   
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    
    public String getDni() { 
        return dni; 
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }
    
    
    
    
}



