package logica;

public class autoMain {
    public static void main(String[] args) {
        Audi autoModerno= new Audi();
        autoModerno.muestraAceleracion();
        Ford autoClasico= new Ford();
        autoClasico.muestraAceleracion();

if (autoModerno instanceof Audi) {
    System.out.println("auto moderno es audi");
}
    }

}