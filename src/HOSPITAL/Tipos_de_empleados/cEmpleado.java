/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOSPITAL.Tipos_de_empleados;

/**
 *
 * @author wedee
 */
public abstract class  cEmpleado extends cPersona{
    
    private String rol; 
    private String login;
    private String password;

    // Constructor
    public cEmpleado(String dni, String nombres, String apellidos, String datosContacto, String rol, String login, String password) {
        
        super(dni, nombres, apellidos, null, null, datosContacto);
        this.rol = rol;
        this.login = login;
        this.password = password;
    }

    @Override
    public String getTipoPersona() {
        return "Empleado - " + rol;
    }

    // Método para la Autenticación (se podría mejorar con hashing de password)
    public boolean autenticar(String loginIngresado, String passwordIngresada) {
        return this.login.equals(loginIngresado) && this.password.equals(passwordIngresada);
    }
    
    public String getRol() { 
        return rol; 
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }

    public String getDNI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
   
    

