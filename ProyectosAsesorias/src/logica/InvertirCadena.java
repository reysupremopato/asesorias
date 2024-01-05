/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USER
 */
public class InvertirCadena {
public static void main(String[] args) {
    invertirCadena("hola");
    
}
public static void invertirCadena(String cadena){
    String cadenaInvertida= "";
 for(int i= 0; i < cadena.length(); i++){
    String caracterActual= cadena.substring(i, i + 1);
cadenaInvertida= caracterActual + cadenaInvertida;

 }
    System.out.println(cadenaInvertida);
}
    
}
