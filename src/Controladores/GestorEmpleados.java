/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import HOSPITAL.Tipos_de_empleados.cEmpleado;

/**
 *
 * @author O26304
 */
public class GestorEmpleados {
    private cEmpleado [] listaEmpleados;
    private int nroEmpleados;
    
    public GestorEmpleados() {
        this.listaEmpleados = new cEmpleado[10];
        this.nroEmpleados = 0;
    }
    
    public void AgregarEmpleado(cEmpleado empleado){
        this.listaEmpleados[this.nroEmpleados] = empleado;
        this.nroEmpleados++;
    }
    
    public void Eliminar(String DNI)
    {
        for(int i=0;i<nroEmpleados;i++)
        {
            if(listaEmpleados[i].getNombres().equalsIgnoreCase(DNI))
            {
                for(int j=i;j<nroEmpleados-1;j++)
                {
                    listaEmpleados[j]=listaEmpleados[j+1];
                }
                listaEmpleados[nroEmpleados-1]=null;
                nroEmpleados--;
            }
        }
    }
    
   public void modificar(String DNI_empleado, cEmpleado nueva_data){
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.listaEmpleados[i].getDni().equals(DNI_empleado)){
                this.listaEmpleados[i].setNombres(nueva_data.getNombres());
                this.listaEmpleados[i].setApellidos(nueva_data.getApellidos());
                this.listaEmpleados[i].setDni(nueva_data.getDNI());
         
                this.listaEmpleados[i].setDatosContacto(nueva_data.getDatosContacto());
               
            }
            
        }
        
        
    }
            
            
            
            
            

    public cEmpleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(cEmpleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }

    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }
    
}
