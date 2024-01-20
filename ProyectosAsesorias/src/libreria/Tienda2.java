/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

import java.util.*;

/**
 *
 * @author USER
 */
public class Tienda2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro(120, 200, "titulo1");
        Libro libro2 = new Libro(300, 120, "titulo2");
        Libro libro3 = new Libro(50, 500, "titulo3");
        Libro libro4 = new Libro(999, 240, "titulo4");
        Libro libro5 = new Libro(51, 100, "titulo5");
        Libro libro6 = new Libro(665, 450, "titulo6");

        Cliente cliente1 = new Cliente(1, "juan", "gomez");
        Cliente cliente2 = new Cliente(2, "Diego", "Martinez");
        Cliente cliente3 = new Cliente(3, "Fernando", "Ramirez");
        Cliente cliente4 = new Cliente(4, "pablo", "g");
        Cliente cliente5 = new Cliente(5, "nombre5", "h");
        Cliente cliente6 = new Cliente(6, "nombre6", "j");

        Venta venta1 = new Venta(1, cliente1, libro1, 2, 0);
        Venta venta2 = new Venta(2, cliente2, libro2, 2, 0);
        Venta venta3 = new Venta(3, cliente3, libro3, 2, 0);
        Venta venta4 = new Venta(4, cliente4, libro4, 2, 0);
        Venta venta5 = new Venta(5, cliente5, libro5, 2, 0);
        Venta venta6 = new Venta(6, cliente6, libro6, 2, 0);
        List<Venta> ventas = new ArrayList<>();
        ventas.add(venta1);
        ventas.add(venta2);
        ventas.add(venta3);
        ventas.add(venta4);
        ventas.add(venta5);
        ventas.add(venta6);
        ventas.forEach(ventaActual -> {
            ventaActual.setMontoTotal(ventaActual.getLibro().getPrecio() * (ventaActual.getIva() / 100)
                    + ventaActual.getLibro().getPrecio());

        });
        ventas.forEach(ventaActual -> {
            System.out.println(ventaActual.getMontoTotal());
        });
    }
}
