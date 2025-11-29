/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CREACIONES;

/**
 *
 * @author ASUS
 */
public class cReceta {
    private cMedicamento [] medicamentos;
    private int count;

    public cReceta() {
        this.medicamentos = new cMedicamento[10];
        this.count = 0;
    }
    
    public boolean agregarMedicamento(cMedicamento m ){
        if(count<medicamentos.length){
            medicamentos[count]=m;
            count++;
            return true;
        }
        return false;
    }
    
    public boolean modificar(String nombre, cMedicamento newData) {
        for (int i=0; i<count; i++) {
            if (medicamentos[i].getNombre().equals(nombre)) {
                medicamentos[i].setDosisPaciente(newData.getDosisPaciente());
                medicamentos[i].setDuracion_suministro(newData.getDuracion_suministro());
                medicamentos[i].setDosificación(newData.getDosificación());
                medicamentos[i].setMarca(newData.getMarca());
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String medEliminar) {
        for (int i=0; i<count; i++) {
            if (medicamentos[i].getNombre().equals(medEliminar)) {               
                for (int j=i; j<count-1; j++) {
                    medicamentos[j] = medicamentos[j+1];
                }
                medicamentos[count-1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
    
    public cMedicamento[] ver() {
        cMedicamento[] listaCompleta = new cMedicamento[count];
        for (int i = 0; i < count; i++) {
            listaCompleta[i] = medicamentos[i];
        }
        return listaCompleta;      
    }
    
}
