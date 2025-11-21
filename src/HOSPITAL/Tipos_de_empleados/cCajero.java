/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author wedee
 */
public abstract class cCajero extends cEmpleado {
  

    public cCajero(String rol, String userName, String login, String password, String role, String dni, String nombre, String apellidos, String datosContacto) {
        super(login, password, role, dni, nombre, apellidos, datosContacto);
       
    }
    

   

  


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

   

    

    
    
    
}
