/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author wedee
 */
public class cMedico extends cEmpleado{

    private  String especialidad;

 
    public cMedico(String dni, String nombres, String apellidos, String datosContacto, String login, String password, String especialidad) {
        super(dni, nombres, apellidos, datosContacto, "Medico", login, password);
        this.especialidad = especialidad;
    }
    
    @Override
    public String getTipoPersona() {
        return "Medico - " + especialidad;
    }

    
    public String getEspecialidad() { 
        return especialidad;
    }
    
}
    
    

