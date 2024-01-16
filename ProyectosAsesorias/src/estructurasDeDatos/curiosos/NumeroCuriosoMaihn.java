/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeDatos.curiosos;

/**
 *
 * @author USER
 */
public class NumeroCuriosoMaihn {
    public static void main(String[] args) {
        NumerosCuriososLogica ncl= new NumerosCuriososLogica(); 
        System.out.println(ncl.contarDigitos(625));
        System.out.println(ncl.esCurioso(6));
        ncl.mostrarCurioso(25);
        ncl.mostrarCuriosos(1, 10000);
    }

}

