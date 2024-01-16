package estructurasDeDatos.amigos;

public class NumeroAmigo {
    private int numero;
    private int numeroAmigo;


    public NumeroAmigo(int numero, int numeroAmigo) {
        this.numero = numero;
        this.numeroAmigo = numeroAmigo;

    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    public int getNumeroAmigo() {
        return numeroAmigo;
    }

    public void setNumeroAmigo(int numeroAmigo) {
        this.numeroAmigo = numeroAmigo;
    }

}