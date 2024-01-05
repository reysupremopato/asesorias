package logica;
public abstract class Auto {
    private String nombre;
    private String color;
    private int anio;

    public Auto(String nombre, String color, int anio) {
        this.nombre = nombre;
        this.color = color;
        this.anio = anio;

    }

    public Auto() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int anio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public abstract void muestraAceleracion();

}