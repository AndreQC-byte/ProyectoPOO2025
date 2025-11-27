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

public class GestorPacientes {
    private cPaciente[] listapacientes;
    private int cont;

    public GestorPacientes() {
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
            if (this.listapacientes[i].getDni().equals(DNI_paciente)){
                this.listapacientes[i].setDni(nueva_data.getNombres());
                this.listapacientes[i].setApellidos(nueva_data.getNombres());
                this.listapacientes[i].setDni(nueva_data.getDni());
                this.listapacientes[i].setFechaNacimiento(nueva_data.getFechaNacimiento());
                this.listapacientes[i].setSexo(nueva_data.getSexo());
                this.listapacientes[i].setDatosContacto(nueva_data.getDatosContacto());
                this.listapacientes[i].setContactoEmergencia(nueva_data.getContactoEmergencia());
            }
            
        }
    }
    
    public void eliminar_paciente(String DNI){
        for(int i=0;i<cont;i++){
            if(listapacientes[i].getDni().equalsIgnoreCase(DNI)){
                
                listapacientes[i]=listapacientes[cont-1];
                
                listapacientes[cont-1]=null;
                cont--;
                return;
            }
        }
        
        
    }
    public cPaciente[] getLista(){
        return listapacientes;
    }

    public int getCont() {
        return cont;
    }
    
    
    
    
}
