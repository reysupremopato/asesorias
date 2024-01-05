/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raizDigital;

/**
 *
 * @author USER
 */
public class RaizDigital {

    public static void main(String[] args) {
        RaizDigital raizDigital = new RaizDigital();
        raizDigital.calcularRaizDigital(999);

    }

    public int sumaDigitos(int numero) {
        int sumaDigitos = 0;
        int i = numero;

        while (i > 0) {
            sumaDigitos = sumaDigitos + (i % 10);
            i = i / 10;

        }
        return sumaDigitos;
    }

    public void calcularRaizDigital(int numero) {
        int raizDigital= sumaDigitos(numero);
        
while(raizDigital > 9){        
        raizDigital= sumaDigitos(raizDigital);
    }
        System.out.println("la raiz digital es " + raizDigital);
}
    
}