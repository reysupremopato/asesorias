/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USER
 */
public class Anagramas {
    public static void main(String[] args) {
        Anagramas anagramas = new Anagramas();
        System.out.println(anagramas.quitarEspacios("hola como estas"));
    }

    public String quitarEspacios(String cadena) {

        return cadena.replace(" ", "");

    }

    
}
