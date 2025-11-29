/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CREACIONES;

/**
 *
 * @author ASUS
 */
public class cFactura {
    private String nroFactura;
    private String fechaEmision;
    private String metodoPago;
    private double totaldeFactura;

    public cFactura(String nroFactura, String fechaEmision, String metodoPago, double totaldeFactura) {
        this.nroFactura = nroFactura;
        this.fechaEmision = fechaEmision;
        this.metodoPago = metodoPago;
        this.totaldeFactura = totaldeFactura;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getTotaldeFactura() {
        return totaldeFactura;
    }

    public void setTotaldeFactura(double totaldeFactura) {
        this.totaldeFactura = totaldeFactura;
    }
    
    
}
