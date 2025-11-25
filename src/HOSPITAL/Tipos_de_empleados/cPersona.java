/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author User
 */
public class cPersona {
    // Persona.java
public abstract class Persona {
    private String dni;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento; // Simplificado como String por ahora
    private String sexo;
    private String datosContacto;

    // Constructor
    public Persona(String dni, String nombres, String apellidos, String fechaNacimiento, String sexo, String datosContacto) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.datosContacto = datosContacto;
    }

    // Métodos abstractos que deben ser implementados por las clases hijas
    public abstract String getTipoPersona();

    // Método concreto común a todas las personas
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Getters y Setters (solo se muestran algunos por brevedad)
    public String getDni() { return dni; }
    // ... otros getters y setters
}
}
