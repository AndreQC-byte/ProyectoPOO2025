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
    
    public void AgregarEmpleado(String pUsername, String pPassword, String pRole){
        this.listaEmpleados[this.nroEmpleados] = new cEmpleado(pUsername, pPassword, pRole);
    }
    
    
    
}
