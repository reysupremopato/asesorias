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
        System.out.println(anagramas.contarCaracterEnCadena("pala", "a"));
        System.out.println(anagramas.esAnagrama("fresa", "frase"));
        anagramas.mostrarAnagramas("fresa", "fras        e");
    }

    public String quitarEspacios(String cadena) {

        return cadena.replace(" ", "");

    }

    public int contarCaracterEnCadena(String cadena, String caracter) {
        int cuenta = 0;
        for (int i = 0; i < cadena.length(); i++) {
            String caracterActual = cadena.substring(i, i + 1);
            if (caracterActual.equals(caracter)) {
                cuenta++;
            }

        }
        return cuenta;

    }

    public boolean esAnagrama(String cadena1, String cadena2) {
        boolean bandera = true;
        String cadena1SinEspacios = quitarEspacios(cadena1);
        String cadena2SinEspacios = quitarEspacios(cadena2);
        if (cadena1SinEspacios.length() != cadena2SinEspacios.length()) {
            return false;
        }

        for (int i = 0; i < cadena1SinEspacios.length(); i++) {
            String caracterActual = cadena1SinEspacios.substring(i, i + 1);
            if (contarCaracterEnCadena(cadena1SinEspacios, caracterActual) != contarCaracterEnCadena(cadena2SinEspacios,
                    caracterActual)) {
                bandera = false;
                break;
            }
        }
        return bandera;

    }

    public void mostrarAnagramas(String cadena1, String cadena2) {
        if (esAnagrama(cadena1, cadena2)) {
            System.out.println("las cadenas son anagramas " + cadena1 + " " + cadena2);
        }

    }
}
