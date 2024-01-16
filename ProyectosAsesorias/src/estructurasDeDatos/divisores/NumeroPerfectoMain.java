package estructurasDeDatos.divisores;

public class NumeroPerfectoMain {
    public static void main(String[] args) {
        NumeroPerfectoLogica npl= new NumeroPerfectoLogica();
        System.out.println(npl.sumarDivisores(28));
        System.out.println(npl.esPerfecto(28));       
        npl.mostrarNumeroPerfecto(28);
    }
}
