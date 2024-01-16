/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeDatos.curiosos;

import java.util.*;

/**
 *
 * @author USER
 */
public class NumerosCuriososLogica implements NumeroCuriosoInterface {

    @Override
    public int contarDigitos(int numero) {
        int cuentaDigitos = 0;
        int i = numero;
        while (i > 0) {
            i = i / 10;
            cuentaDigitos++;

        }
        return cuentaDigitos;
    }

    @Override
    public int elevarCuadrado(int numero) {
        int cuadrado = (numero * numero);
        return cuadrado;
    }

    @Override
    public boolean esCurioso(int numero) {
        int cuadrado = elevarCuadrado(numero);
        int potencia = contarDigitos(numero);
        int ultimosDigitosCuadrado = (int) (cuadrado % Math.pow(10, potencia));
        if (ultimosDigitosCuadrado == numero) {
            return true;
        }

        return false;
    }

    @Override
    public void mostrarCurioso(int numero) {

        System.out.println("estos numeros son curiosos " + numero + "estos son los cuadrados " + " - " + elevarCuadrado(numero));

    }

    @Override
    public void mostrarCuriosos(int inicio, int fin) {
        List<NumeroCurioso> listaCuriosos = new ArrayList<>();
        for (int i = inicio; i < fin; i++) {
            if (esCurioso(i)) {
                NumeroCurioso numeroCurioso= new NumeroCurioso(i, elevarCuadrado(i));
                listaCuriosos.add(numeroCurioso);
            }

        }
        listaCuriosos.forEach(curiosoActual -> {
            mostrarCurioso(curiosoActual.getNumero());
        });
    }
}
