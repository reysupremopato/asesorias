/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaTopicos;

/**
 *
 * @author USER
 */
public class Wrapper {
public static void main(String[] args) {
int numero= 30;
String numeroCadena= String.valueOf(numero);
if (numeroCadena instanceof String) {
    System.out.println("numero es una cadena" );
}
System.out.println(numeroCadena);
String miNombre= "Omar";
System.out.println(miNombre.charAt(2));
System.out.println(miNombre.contains("ma"));
System.out.println(miNombre.substring(miNombre.length()-1, miNombre.length()));
System.out.println(miNombre.concat(" villanueva"));
System.out.println(miNombre.toLowerCase());
System.out.println(miNombre.toUpperCase());
String nombreCompleto= "         Omar Villanueva        ";
System.out.println(nombreCompleto.trim());
System.out.println(nombreCompleto.replace("b", "v"));
System.out.println(nombreCompleto.replace("b", "v").trim());
System.out.println(nombreCompleto.replace("b", "v").trim().toUpperCase());
    }

    
}
