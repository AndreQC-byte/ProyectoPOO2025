/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import CREACIONES.cConsultorios;

public class GestorConsultorios {

    private cConsultorios[] listaConsultorios;
    private int nroConsultorios;

    public GestorConsultorios() {
        listaConsultorios = new cConsultorios[50];
        nroConsultorios = 0;
    }

    public void agregarConsultorio(cConsultorios c) {
        listaConsultorios[nroConsultorios] = c;
        nroConsultorios++;
    }

    public void eliminar(String codigo) {
        for (int i = 0; i < nroConsultorios; i++) {
            if (listaConsultorios[i].getCodigo().equalsIgnoreCase(codigo)) {

                for (int j = i; j < nroConsultorios - 1; j++) {
                    listaConsultorios[j] = listaConsultorios[j + 1];
                }

                listaConsultorios[nroConsultorios - 1] = null;
                nroConsultorios--;
                return;
            }
        }
    }

    public void modificar(String codigo, cConsultorios nuevo) {
        for (int i = 0; i < nroConsultorios; i++) {
            if (listaConsultorios[i].getCodigo().equalsIgnoreCase(codigo)) {

                listaConsultorios[i].setEspecialidad(nuevo.getEspecialidad());
                listaConsultorios[i].setEstado(nuevo.getEstado());
                listaConsultorios[i].setDia(nuevo.getDia());
                listaConsultorios[i].setAmbiente(nuevo.getAmbiente());
                listaConsultorios[i].setCodigo(nuevo.getCodigo());

                return;
            }
        }
    }

    public cConsultorios[] getListaConsultorios() {
        return listaConsultorios;
    }

    public int getNroConsultorios() {
        return nroConsultorios;
    }
}
