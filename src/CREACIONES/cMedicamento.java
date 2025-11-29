/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CREACIONES;

/**
 *
 * @author ASUS
 */
public class cMedicamento {
    private String nombre;
    private String dosificación;
    private String duracion_suministro;
    private String dosisPaciente;
    private String marca;

    public cMedicamento(String nombre, String dosificación, String duracion_suministro, String dosisPaciente, String marca) {
        this.nombre = nombre;
        this.dosificación = dosificación;
        this.duracion_suministro = duracion_suministro;
        this.dosisPaciente = dosisPaciente;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosificación() {
        return dosificación;
    }

    public void setDosificación(String dosificación) {
        this.dosificación = dosificación;
    }

    public String getDuracion_suministro() {
        return duracion_suministro;
    }

    public void setDuracion_suministro(String duracion_suministro) {
        this.duracion_suministro = duracion_suministro;
    }

    public String getDosisPaciente() {
        return dosisPaciente;
    }

    public void setDosisPaciente(String dosisPaciente) {
        this.dosisPaciente = dosisPaciente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
