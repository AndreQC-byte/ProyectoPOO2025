/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import CREACIONES.cFactura;

/**
 *
 * @author ASUS
 */
public class GestorFacturas {
    private cFactura [] facturas;
    private int cont;

    public GestorFacturas() {
        this.facturas = new cFactura[10];
        this.cont = 0;
    }
    
    public boolean agregar(cFactura fact) {
        if (cont < facturas.length) {
            facturas[cont] = fact;
            cont++;
            return true;
        }
        return false;
    }
    public cFactura[] verFactura(){
        cFactura[] listCompleta = new cFactura[cont];
        System.arraycopy(facturas, 0, listCompleta, 0, cont);
        return listCompleta;
    }

    public cFactura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(cFactura[] facturas) {
        this.facturas = facturas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
}
