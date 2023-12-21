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
public class Cliente extends Persona {

    private String numeroCuenta;
    private int saldo;
    private int id;

    public Cliente(int edad, String nombre) {
        super(edad, nombre);

    }

    public Cliente(int edad, String nombre, String numeroCuenta, int saldo) {
        super(edad, nombre);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Cliente> registrarClientes(List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la nombre");
        String nombre = scanner.nextLine();
        System.out.println("ingrese la edad");
        int edad = scanner.nextInt();
        System.out.println("ingrese su numero de Cuenta");
        String numeroCuenta = scanner.nextLine();
        System.out.println("ingrese su saldo");
        int saldo = scanner.nextInt();
        Cliente clienteaRegistrar = new Cliente(edad, nombre, numeroCuenta, saldo);
        clientes.add(clienteaRegistrar);
        return clientes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrarListaClientes(List<Cliente> clientes) {

        clientes.forEach(clienteActual -> {
            System.out.println(clienteActual.getId() + " - " + clienteActual.getNombre());
        });
    }

    public Cliente consultarPorId(List<Cliente> clientes, int id) {
        int indiseCliente = 0;

        clientes.forEach(clienteActual -> {
            if (id == clienteActual.getId()) {
                Cliente cliente = clienteActual();

            }
        });
    }

}
