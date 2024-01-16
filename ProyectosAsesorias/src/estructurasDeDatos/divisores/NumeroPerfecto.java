package estructurasDeDatos.divisores;

public class NumeroPerfecto {
    private int numero;
    private int sumaDivisores;

    public NumeroPerfecto(int numero, int sumaDivisores) {
        this.numero = numero;
        this.sumaDivisores = sumaDivisores;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSumaDivisores() {
        return sumaDivisores;
    }

    public void setSumaDivisores(int sumaDivisores) {
        this.sumaDivisores = sumaDivisores;
    }

}