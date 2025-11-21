/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author wedee
 */
public class cCajero extends Persona {
    private String rol;
    private String userName;
    private String password;

    public cCajero(String rol, String userName, String password, String dni, String nombre, String apellidos, String datosContacto) {
        super(dni, nombre, apellidos, datosContacto);
        this.rol = rol;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String getInfo() {
        return "";
    }
    
    
}
