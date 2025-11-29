/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CREACIONES;

public class cConsultorios {

    private String codigo;
    private String especialidad;
    private String estado;
    private String dia;
    private String ambiente;

    public cConsultorios(String codigo, String especialidad, String estado, String dia, String ambiente) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
        this.dia = dia;
        this.ambiente = ambiente;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getDia() { return dia; }
    public void setDia(String dia) { this.dia = dia; }

    public String getAmbiente() { return ambiente; }
    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }
}
