/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author O26302
 */
import HOSPITAL.Tipos_de_empleados.*;

public class Gestionpacientes {
    private cPaciente[] listapacientes;
    private int cont;

    public Gestionpacientes() {
        this.listapacientes= new cPaciente[100];
        this.cont=0;
    }
    
    public void registrar(cPaciente nuevo_paciente){
        if(this.listapacientes.length<=100){
            this.listapacientes[this.cont]= nuevo_paciente;
        }
        else{
            System.out.println("No hay espacio");
        }
        this.cont++;
    }
    public void modificar(String DNI_paciente, cPaciente nueva_data){
        for (int i = 0; i < cont; i++) {
            if (this.listapacientes[i].getDNI().equalsIgnoreCase(DNI_paciente)){
                this.listapacientes[i]= nueva_data;
            }
            
        }
        
        
    }
    
    public void eliminar_paciente(){
        
        
        
    }
    
    
    
    
}
