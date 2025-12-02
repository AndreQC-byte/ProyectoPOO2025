/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import HOSPITAL.Atenciones.cConsultorios.cCitasMedicas;
import HOSPITAL.Tipos_de_empleados.cMedico;

public class GestorCitasMedicas {

    private cCitasMedicas[] citas;
    private int cont;
    private String medico;

    public GestorCitasMedicas() {
        this.citas = new cCitasMedicas[100];
        this.cont = 0;
    }

    // Crear nueva cita
    public void crear(String especialidad, String consultorio, String fecha,String hora,String medico, String modalidad,String estado) {
        if (cont < citas.length) {
            cCitasMedicas nuevaCita = new cCitasMedicas(especialidad, fecha,hora, medico, consultorio, modalidad,estado);
            citas[cont] = nuevaCita;
            cont++;
        } else {
            System.out.println("No hay espacio para más citas");
        }
    }

    // Modificar cita existente
    public void modificar(int numero_cita, String especialidad, String consultorio, String fecha, String medico, String modalidad) {
        if (numero_cita >= 0 && numero_cita < cont) {
            citas[numero_cita].setEspecialidad(especialidad);
            citas[numero_cita].setConsultorio(consultorio);
            citas[numero_cita].setFecha(fecha);
            citas[numero_cita].setMedico(medico);
            citas[numero_cita].setModalidad(modalidad);
        } else {
            System.out.println("Número de cita inválido");
        }
    }

    // Eliminar cita
    public void eliminar(int numero_cita) {
        if (numero_cita >= 0 && numero_cita < cont) {
            for (int i = numero_cita; i < cont - 1; i++) {
                citas[i] = citas[i + 1];
            }
            citas[cont - 1] = null;
            cont--;
        } else {
            System.out.println("Número de cita inválido");
        }
    }

    // Validar si hay alguna cita registrada
    public boolean validarCita() {
        return cont > 0;
    }

    // Getters y setters
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

    public void eliminarCita(int fila) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}