/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author ASUS
 */
public class Administrador extends Persona {
    private String rol;
    private String username;
    private String password;

    public Administrador(String rol, String username, String password, String dni, String nombre, String apellidos, String datosContacto) {
        super(dni, nombre, apellidos, datosContacto);
        this.rol = rol;
        this.username = username;
        this.password = password;
    }

    @Override
    public String getInfo() {
        return "";
    }
    
    
}
