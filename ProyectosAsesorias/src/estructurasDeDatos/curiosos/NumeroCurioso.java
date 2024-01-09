/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeDatos.curiosos;

/**
 *
 * @author USER
 */
public class NumeroCurioso {

    private int numero;
    private int cuadrado;
    private int cantidadDigitos;

    public NumeroCurioso(int numero, int cuadrado, int cantidadDigitos) {
        this.numero = numero;
        this.cuadrado = cuadrado;
        this.cantidadDigitos = cantidadDigitos;
    }

    public NumeroCurioso() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(int cuadrado) {
        this.cuadrado = cuadrado;
    }

    public int getCantidadDigitos() {
        return cantidadDigitos;
    }

    public void setCantidadDigitos(int cantidadDigitos) {
        this.cantidadDigitos = cantidadDigitos;
    }

    public String toString() {
        return getNumero() + "^ = " + getCuadrado();
    }
}
