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
            if(listaEmpleados[i].getNombre().equalsIgnoreCase(DNI))
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
    
}
