package poo_modelado_uml;

public class mainLibreria {
    public static void main(String[] args) {
        Autor autor = new Autor("Carlos", 27, "Alemania");
        Libro libro = new Libro("titulo1", "01, enero, 2023", "descripcion1", autor);
        System.out.println(libro.getAutor().getNombre());
        System.out.println(libro.getAutor().getEdad());
        System.out.println(libro.getAutor().getProcedencia());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getDescripcionGeneral());
        System.out.println(libro.getFechaPublicacion());

        System.out.println("hola mundo".getClass());
        
    }

}
