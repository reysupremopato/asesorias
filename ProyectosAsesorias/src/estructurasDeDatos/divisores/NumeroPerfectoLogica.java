package estructurasDeDatos.divisores;

import java.util.*;

public class NumeroPerfectoLogica implements NumeroPerfectoInterface {
    List<NumeroPerfecto> numerosPerfectos = new ArrayList();

    @Override
    public int sumarDivisores(int numero) {
        int sumaDivisor = 0;
        int i = 1;
        while (i < numero) {
            if (numero % i == 0) {
                sumaDivisor = sumaDivisor + i;
            }
            i++;
        }
        return sumaDivisor;
    }

    @Override
    public boolean esPerfecto(int numero) {
        int numeroPerfecto = sumarDivisores(numero);
        if (numeroPerfecto == numero) {
            return true;
        }
        return false;
    }

    @Override
    public void mostrarNumeroPerfecto(int numero) {
        if (esPerfecto(numero)) {
            System.out.println(numero);
        }

    }

    @Override
    public void mostrarNumerosPerfectos() {

    }

}