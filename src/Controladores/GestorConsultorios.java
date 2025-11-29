/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import HOSPITAL.Atenciones.cConsultorios.cConsultorios;

/**
 *
 * @author O26302
 */
public class GestorConsultorios {
    private cConsultorios [] listaConsultorios;
    private int nroConsultorios;
    
    public GestorConsultorios() {
        this.listaConsultorios = new cConsultorios[10];
        this.nroConsultorios = 0;
    }
    
    public void AgregarConsultorio(cConsultorios empleado){
        this.listaConsultorios[this.nroConsultorios] = empleado;
        this.nroConsultorios++;
    }
    
    public void Eliminar(String codigo)
    {
        for(int i=0;i<nroConsultorios;i++)
        {
            if(listaConsultorios[i].getCodigo().equalsIgnoreCase(codigo))
            {
                for(int j=i;j<nroConsultorios-1;j++)
                {
                    listaConsultorios[j]=listaConsultorios[j+1];
                }
                listaConsultorios[nroConsultorios-1]=null;
                nroConsultorios--;
            }
        }
    }
    
   public void modificar(String codigo, cConsultorios nueva_data){
        for (int i = 0; i < this.nroConsultorios; i++) {
            if (this.listaConsultorios[i].getCodigo().equals(codigo)){
                this.listaConsultorios[i].setEstado(nueva_data.getEstado());
                this.listaConsultorios[i].setHorario(nueva_data.getHorario());
                this.listaConsultorios[i].setCodigo(nueva_data.getCodigo());

            }
            
        }               
    }
   
   public cConsultorios getConsultorio(String codigo)
   {
       return this.listaConsultorios[0];
   }
   
   public boolean ValidarUsuario(String login,String password)
   {
       return true;
   }

    public cConsultorios[] getListaConsultorios() {
        return listaConsultorios;
    }

    public void setListaConsultorios(cConsultorios[] listaConsultorios) {
        this.listaConsultorios = listaConsultorios;
    }

    public int getNroConsultorios() {
        return nroConsultorios;
    }

    public void setNroConsultorios(int nroConsultorios) {
        this.nroConsultorios = nroConsultorios;
    }
            
            
            
            
            

    
    
    
}
