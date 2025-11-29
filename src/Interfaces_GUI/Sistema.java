/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_GUI;
import HOSPITAL.Tipos_de_empleados.Administrador;
import HOSPITAL.Tipos_de_empleados.cCajero;
import HOSPITAL.Tipos_de_empleados.cMedico;
import HOSPITAL.Tipos_de_empleados.cRecepcionista;

/**
 *
 * @author N04117
 */
public class Sistema {
    public static void main(String[] args) {
        DataAdmin.InicializarAdmin();
        DataAdmin.empleados.AgregarEmpleado(new Administrador("12121212", "Adriana", "Cabero", "948987987", "Admin", "acabero", "123456"));
        DataAdmin.empleados.AgregarEmpleado(new cMedico("12345678", "Carlos", "Garcia", "948987987", "cgarcia", "123456", "Pediatra"));
        DataAdmin.empleados.AgregarEmpleado(new cCajero("923821", "Mel Gibson", "Veracruz", "093219831", "cajero", "soytupapi", "123456"));
        DataAdmin.empleados.AgregarEmpleado(new cRecepcionista("932842", "Jasson", "Mackgregor", "92383", "recepcionista", "", "123456"));
        Login x = new Login();
        x.setVisible(true);
    }
}
