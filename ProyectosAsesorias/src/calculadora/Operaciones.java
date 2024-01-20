/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author USER
 */
public class Operaciones extends Valores implements OperacionesInterface {

    public Operaciones(int numero1, int numero2) {
        super(numero1, numero2);

    }

    @Override
    public int suma() {
        return getNumero1() + getNumero2();
    }

    @Override
    public int resta() {

        return getNumero1() - getNumero2();
    }

    @Override
    public int multiplicacion() {
        return getNumero1() * getNumero2();
    }

    @Override
    public int division() {
        if (getNumero2() != 0) {
            return getNumero1() / getNumero2();
        } else {
            System.out.println("error el numero 2 no puede ser 0");
            return -1;
        }
    }

    @Override
    public int modulo() {
        if (getNumero2() != 0) {
            return getNumero1() % getNumero2();
        } else {
            System.out.println("error el numero 2 no puede ser 0");
            return -1;
        }

    }
}