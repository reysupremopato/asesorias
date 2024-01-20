/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author USER
 */
public class Venta {

    private int idVenta;
    private Cliente cliente;
    private Libro libro;
    private double iva;
    private double montoTotal;

    public Venta() {

    }

    public Venta(int idVenta, Cliente cliente, Libro libro, double iva, double montoTotal) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.libro = libro;
        this.iva = iva;
        this.montoTotal = montoTotal;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

}
