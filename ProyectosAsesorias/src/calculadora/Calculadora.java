package calculadora;

import java.util.*;

public class Calculadora {

    public void menu() {

        int opcion = 0;
        while (opcion != 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("bienvenido a la calculadora, que desea realizar");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4 division");
            System.out.println("5. modulo");
            System.out.println("6. finalizar el programa");
            opcion = scanner.nextInt();
            scanner.close();
            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                    division();
                    break;
                case 5:
                    modulo();
                    break;
                case 6:
                    System.out.println(" saliendo del programa ");
                    break;
                default:
                    System.out.println("opcion incorrecta vuelva a intentarlo");
                    break;

            }

        }
    }

    public static void suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el numero 2");
        int numero2 = scanner.nextInt();
        scanner.close();
        Operaciones operaciones = new Operaciones(numero1, numero2);
        int resultado = operaciones.suma();
        System.out.println("la suma es " + resultado);

    }

    public static void resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero1");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el numero 2");
        int numero2 = scanner.nextInt();
        scanner.close();
        Operaciones operaciones = new Operaciones(numero1, numero2);
        int resultado = operaciones.resta();
        System.out.println("el resultado de al resta es " + resultado);
    }

    public static void multiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el numero 2");
        int numero2 = scanner.nextInt();
        scanner.close();
        Operaciones operaciones = new Operaciones(numero1, numero2);
        int resultado = operaciones.multiplicacion();
        System.out.println("el resultado de la multiplicacion es " + resultado);

    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el numero dos, nota, el numero no puede ser cero");
        int numero2 = scanner.nextInt();
        scanner.close();
        Operaciones operaciones = new Operaciones(numero1, numero2);
        int resultado = operaciones.division();
        System.out.println("el resultado de la division es " + resultado);

    }

    public static void modulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el numero dos, nota, el numero no puede ser cero");
        int numero2 = scanner.nextInt();
        scanner.close();
        Operaciones operaciones = new Operaciones(numero1, numero2);
        int resultado = operaciones.modulo();
        System.out.println("el resultado del modulo es  " + resultado);
    }
}