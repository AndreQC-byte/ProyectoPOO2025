/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import HOSPITAL.Atenciones.cConsultorios.cCitasMedicas;
import HOSPITAL.Tipos_de_empleados.cMedico;

/**
 *
 * @author wedee
 */
public class GestorCitasMedicas {
    //GESTORCITAS
    private cCitasMedicas[] citas;
    private int cont;
    //PARA EL GESTOR DE CITAS
    public GestorCitasMedicas() {
        this.citas = new cCitasMedicas[100];
        this.cont=0;
    }

    
    public void  crear(String especialidad, String consultorio, String fecha, cMedico medico, String Modalidad){
         if(this.citas.length<=100){
            this.citas[this.cont].especialidad= especialidad;
            this.citas[this.cont].consultorio= consultorio;
            this.citas[this.cont].fecha= fecha;
            this.citas[this.cont].medico= medico;
            this.citas[this.cont].modalidad= Modalidad;       
            
        }
        else{
            System.out.println("No hay espacio");
        }
        this.cont++;
    }
    
    public void modificar(int numero_cita,String especialidad, String consultorio, String fecha, cMedico medico, String Modalidad){
        for (int i = 0; i < this.citas.length; i++) {
            if(this.citas[i]==this.citas[numero_cita]){
            this.citas[this.cont].especialidad= especialidad;
            this.citas[this.cont].consultorio= consultorio;
            this.citas[this.cont].fecha= fecha;
            this.citas[this.cont].medico= medico;
            this.citas[this.cont].modalidad= Modalidad;   
            }
        }
        
    }
    
    public void eliminar(int numero_cita){
         
        for(int i=0;i<cont;i++)
        {
            if(this.citas[i]== this.citas[numero_cita])
            {
                for(int j=i;j<cont-1;j++)
                {
                    this.citas[j]=this.citas[j+1];
                }
                this.citas[cont-1]=null;
                cont--;
            }
        }
    }
    
    
    public boolean validarCita(){
         for (int i = 0; i < this.citas.length; i++) {
           if(this.citas[i]!=null){
               return true;
           }
           else{
               return false;
           }
       }
       return false;
    }

    public cCitasMedicas[] getCitas() {
        return citas;
    }

    public void setCitas(cCitasMedicas[] citas) {
        this.citas = citas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
    
    
    
}
