/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author wedee
 */
public abstract class  cEmpleado {
    protected String login;
    protected String password;
    protected String DNI;
    protected String nombre;
    protected String apellidos;
    protected String datosContacto;

    public cEmpleado(String login, String password, String DNI, String nombre, String apellidos, String datosContacto) {
        
        this.login = login;
        this.password = password;
        this.DNI= DNI;
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.datosContacto = datosContacto;
    }

   
    
}
