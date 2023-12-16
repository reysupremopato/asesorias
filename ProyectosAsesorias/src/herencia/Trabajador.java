/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author USER
 */
public class Trabajador extends Persona {

    private String numeroTrabajador;
    private double salario;

    public Trabajador(String numeroTrabajador, double salario, String nombre, Integer edad, String apellido) {
        super(nombre, edad, apellido);

        this.numeroTrabajador = numeroTrabajador;
        this.salario = salario;

    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    }
