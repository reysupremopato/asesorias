package estructurasDeDatos.amigos;

import java.util.*;

public class NumeroAmigoLogica implements NumeroAmigoInterface {
    List<NumeroAmigo> amigos = new ArrayList<>();

    @Override
    public int sumaDivisores(int numero) {
        int sumaDivisores = 0;
        int i = 1;
        while (i < numero) {
            if (numero % i == 0) {
                sumaDivisores = sumaDivisores + i;

            }
            i++;

        }
        return sumaDivisores;
    }

    @Override
    public boolean tieneAmigo(int numero) {
        int suma1 = sumaDivisores(numero);

        int suma2 = sumaDivisores(suma1);

        if (suma2 == numero && numero > sumaDivisores(numero)) {
            return true;
        }
        return false;
    }

    @Override
    public void mostrarAmigo(int numero) {
        if (tieneAmigo(numero)) {
            System.out.println("el numero" + numero + "tiene amigo y es el " + sumaDivisores(numero) + "");

        }
    }

    @Override
    public void mostrarAmigos(int inicio, int fin) {
        for (int i = inicio; i < fin; i++) {

            if (tieneAmigo(i)) {
                NumeroAmigo numeroAmigo = new NumeroAmigo(i, sumaDivisores(i));
                this.amigos.add(numeroAmigo);
            }

        }
        amigos.forEach(amigoActual -> {
            mostrarAmigo(amigoActual.getNumero());
        });
    }

}
