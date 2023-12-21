/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appBanco;

import java.util.*;

/**
 *
 * @author USER
 */
public class BancoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {

            System.out.println("bienvenido. que desea realizar");
            System.out.println("2 para mostrar la información del cliente");
            System.out.println("3 para borrar un cliente");
            System.out.println("4 para salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else {
                System.out.println("valor invalido");
            }

        }

    }

}
