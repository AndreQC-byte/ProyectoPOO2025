/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_GUI;

import Controladores.GestorEmpleados;
import Controladores.GestorPacientes;
import HOSPITAL.Tipos_de_empleados.cEmpleado;

/**
 *
 * @author User
 */
public class DataAdmin {
    static GestorEmpleados empleados;
    static GestorPacientes pacientes;
    static cEmpleado activeUser;
    
    public void admin(){
       
        
    }
    
    static void InicializarAdmin()
    {
        empleados = new GestorEmpleados();
        pacientes = new GestorPacientes();
    }
}
