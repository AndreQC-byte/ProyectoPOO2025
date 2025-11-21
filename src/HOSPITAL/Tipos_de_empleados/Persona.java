/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author ASUS
 */
public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String datosContacto;

    public Persona(String dni, String nombre, String apellidos, String datosContacto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.datosContacto = datosContacto;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
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
    
    public abstract String getInfo();
}
