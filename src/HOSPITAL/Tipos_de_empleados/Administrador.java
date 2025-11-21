/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author ASUS
 */
public abstract class Administrador extends cEmpleado {
    private String rol;
    private String username;

    public Administrador(String rol, String username, String login, String password, String role, String dni, String nombre, String apellidos, String datosContacto) {
        super(login, password, role, dni, nombre, apellidos, datosContacto);
        this.rol = rol;
        this.username = username;
    }
    
   
            

    

  
    
  
    
}
