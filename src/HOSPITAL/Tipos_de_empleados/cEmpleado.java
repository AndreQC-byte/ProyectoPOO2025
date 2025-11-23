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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }

   
    
}
