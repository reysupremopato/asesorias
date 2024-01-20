/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author USER
 */
public class Tienda {
    public static void main(String[] args) {

        Libro libro1 = new Libro(120, 200, "titulo1");
        Libro libro2 = new Libro(300, 120, "titulo2");
        Libro libro3 = new Libro(50, 500, "titulo3");

        Cliente cliente1 = new Cliente(1, "juan", "gomez");
        Cliente cliente2 = new Cliente(2, "Diego", "Martinez");
        Cliente cliente3 = new Cliente(3, "Fernando", "Ramirez");

        Venta venta1 = new Venta(1, cliente1, libro1, 2, 0);
        Venta venta2 = new Venta(2, cliente2, libro2, 2, 0);
        Venta venta3 = new Venta(3, cliente3, libro3, 2, 0);
        venta1.setMontoTotal((libro1.getPrecio() *(venta1.getIva()/100)) + libro1.getPrecio());
        System.out.println("el monto a pagar es de :" + venta1.getMontoTotal());
venta2.setMontoTotal(libro2.getPrecio() * (venta2.getIva()/100) + libro2.getPrecio());
System.out.println("el monto a pagar es de " + venta2.getMontoTotal());
venta3.setMontoTotal(libro3.getPrecio() * (venta3.getIva()/100) + libro3.getPrecio());
System.out.println("el precio a pagar es de " + venta3.getMontoTotal());

    }
}