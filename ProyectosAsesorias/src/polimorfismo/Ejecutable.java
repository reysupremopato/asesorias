/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author USER
 */
public class Ejecutable {
    public static void main(String[] args) {
    Calculadora suma= new Suma();
    suma.operacion(2, 2);
    Calculadora resta= new Resta();
    resta.operacion(-3, -5);
    }    
}
