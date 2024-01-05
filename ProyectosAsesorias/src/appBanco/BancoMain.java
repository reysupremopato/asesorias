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
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(20, "diego", "123456", 20000, 1));
        clientes.add(new Cliente(20, "juan", "456789", 15000, 2));
        clientes.add(new Cliente(30, "carlos", "584623", 2500, 3));
        clientes.add(new Cliente(25, "carmen", "6974230", 50000, 4));
        clientes.add(new Cliente(28, "diana", "741852963", 60000, 5));

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 6) {

            System.out.println("bienvenido. que desea realizar");
            System.out.println("1. mostrar clientes");
            System.out.println("2 para mostrar la información del cliente");
            System.out.println("3 para borrar un cliente");
            System.out.println("4 para registrar un cliente");
            System.out.println("5 para modificar el saldo");
            opcion = scanner.nextInt();
            Cliente cliente = new Cliente(0, "");

            if (opcion == 1) {
                cliente.mostrarListaClientes(clientes);
            } else if (opcion == 2) {
                cliente.mostrarInformacionClientes(clientes);

            } else if (opcion == 3) {
                clientes = cliente.eliminarClientePorId(clientes);

            } else if (opcion == 4) {
                clientes = cliente.registrarClientes(clientes);

            } else if (opcion == 5) {
                clientes = cliente.modificarSaldo(clientes);

            } else {
                System.out.println("valor invalido");
            }
        }

    }

}
