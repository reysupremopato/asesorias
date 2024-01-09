/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDeDatos.curiosos;

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
            i= i/10;
            cuentaDigitos++;
            
        }
        return cuentaDigitos;
    }

    @Override
    public int elevarCuadrado(int numero) {
        return 0;
    }

    @Override
    public boolean esCurioso(int numero) {
        return false;
    }

    @Override
    public void mostrarCurioso() {

    }

}
