/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.*;

/**
 *
 * @author USER
 */
public class Registro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantas personas va a registrar");
        int cantidadPersonas = scanner.nextInt();
        List<Trabajador> listaTrabajador = new ArrayList<>();
        List<Cliente> listaClientes = new ArrayList<>();

        for (int i = 0; i < cantidadPersonas; i++) {
            int tipoPersona = -1;
            System.out.println("que tipo de persona va a ser, ");
            System.out.println("1 para trabajador");
            System.out.println("2 para cliente");
            tipoPersona = scanner.nextInt();
            if (tipoPersona == 1) {
                System.out.println("ingrese el nombre del trabajador " + (i + 1));
                scanner = new Scanner(System.in);
                String nombre = scanner.nextLine();
                scanner = new Scanner(System.in);
                System.out.println("ingrese su edad");
                int edad = scanner.nextInt();
                scanner = new Scanner(System.in);
                System.out.println("ingrese su apellido");
                String apellido = scanner.nextLine();
                scanner = new Scanner(System.in);
                System.out.println("ingrese el numero dle trabajador");
                String numeroTrabajador = scanner.nextLine();
                scanner = new Scanner(System.in);
                System.out.println("cuanto gana");
                double salario = scanner.nextDouble();
                Trabajador trabajador = new Trabajador(numeroTrabajador, salario, nombre, edad, apellido);
                listaTrabajador.add(trabajador);

            } else if (tipoPersona == 2) {
                System.out.println("ingrese el nombre del cliente " + (i + 1));
                scanner = new Scanner(System.in);
                String nombre = scanner.nextLine();
                scanner = new Scanner(System.in);
                System.out.println("ingrese su edad");
                int edad = scanner.nextInt();
                scanner = new Scanner(System.in);
                System.out.println("ingrese su apellido");
                String apellido = scanner.nextLine();
                scanner = new Scanner(System.in);
                System.out.println("ingrese el método de pago");
                Integer metodoDePago = scanner.nextInt();
                System.out.println("ingrese el numero del cliente");
                Integer numeroCliente = scanner.nextInt();
                Cliente cliente = new Cliente(metodoDePago, numeroCliente, nombre, edad, apellido);
                listaClientes.add(cliente);

            } else {
                System.out.println("el valor ingresado no es valido");

            }

        }
        System.out.println("el numero de trabajadores es :" + listaTrabajador.size());
        System.out.println("el numero de clientes es :" + listaClientes.size());
        mostrarTrabajadores(listaTrabajador);
        mostrarClientes(listaClientes);
        
    }

    public static void mostrarClientes(List<Cliente> clientes) {
        System.out.println("se mostrarn los clientes");
        clientes.forEach(clienteActual -> {
            System.out.println(clienteActual.toString());
        });

    }

    public static void mostrarTrabajadores(List<Trabajador> trabajadores) {
        System.out.println("se mostraran los trabajadores");
        trabajadores.forEach(trabajadorActual
                -> {
            System.out.println(trabajadorActual.toString());
        });

    }

}
