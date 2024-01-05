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

    public Cliente(int edad, String nombre, String numeroCuenta, int saldo, int id) {
        super(edad, nombre);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.id = id;
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
        System.out.println("ingrese el nombre");
        String nombre = scanner.nextLine();
        System.out.println("ingrese la edad");
        int edad = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.println("ingrese su numero de Cuenta");
        String numeroCuenta = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("ingrese su saldo");
        int saldo = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.println("ingrese el identificador");
        int id = scanner.nextInt();

        Cliente clienteaRegistrar = new Cliente(edad, nombre, numeroCuenta, saldo, id);
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

        for (int i = 0; i < clientes.size(); i++) {
            Cliente clienteActual = clientes.get(i);
            if (clienteActual.getId() == id) {
                return clienteActual;
            }
        }
        return null;
    }

    public List<Cliente> eliminarClientePorId(List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        mostrarListaClientes(clientes);
        System.out.println("ingrese el id del cliente que quiere remover");
        int idAeliminar = scanner.nextInt();
        for (int i = 0; i < clientes.size(); i++) {
            if (idAeliminar == clientes.get(i).getId()) {
                clientes.remove(i);
                break;
            }

        }
        return clientes;

    }

    @Override
    public String toString() {
        String faltante = getNombre() + " " + getEdad();

        return faltante + "Cliente{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", id=" + id + '}';
    }

    public void mostrarInformacionClientes(List<Cliente> clientes) {
        mostrarListaClientes(clientes);
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el id del usuario que desea ver la informacion");
        int id = scanner.nextInt();
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getId()) {
                System.out.println(clientes.get(i).toString());
                break;
            }

        }
    }

    public List<Cliente> modificarSaldo(List<Cliente> clientes) {
        mostrarListaClientes(clientes);
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el id del cliente que desea  modificar su saldo");
        int id = scanner.nextInt();

        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getId()) {
                            scanner = new Scanner(System.in);
            System.out.println("ingrese el nuevo saldo");
            int nuevoSaldo = scanner.nextInt();
                clientes.get(i).setSaldo(nuevoSaldo);
break;
            }

        }
        return clientes;
    }
}
