/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author O26302
 */
public class cPaciente {
    protected String DNI;
    protected String nombre, apellidos;
    protected String fecha_nacimiento;
    protected String sexo;
    protected String datosContacto,contactoEmergencia;

    public cPaciente(String nombre, String apellidos,String DNI, String fecha_nacimiento, String sexo, String datosContacto, String contactoEmergencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.datosContacto = datosContacto;
        this.contactoEmergencia = contactoEmergencia;
    }

    public cPaciente(String nom, String ape, String dni, String fecha,String sexo) {
        this.nombre = nom;
        this.apellidos = ape;
        this.DNI = dni;
        this.fecha_nacimiento = fecha;
        this.sexo = sexo;
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
    
    public String verInfo(){
        return "";
    }
    
}
