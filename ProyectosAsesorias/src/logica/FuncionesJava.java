/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USER
 */
public class FuncionesJava {

    public static void main(String[] args) {
        String cadena = "hola mundo";
        quitarEspacios(cadena);

    }

    public static void quitarEspacios(String cadena) {
        String cadenaSinEspacios = "";
        for (int i = 0; i < cadena.length(); i++) {
            String caracterActual = cadena.substring(i, i + 1);
            if ((caracterActual.equals(" ")) == false) {
                cadenaSinEspacios = cadenaSinEspacios + caracterActual;

            }
        }
        System.out.println(cadenaSinEspacios);
    }

}
