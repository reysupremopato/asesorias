/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_modelado_uml;

/**
 *
 * @author USER
 */
public class Libro {
    private String titulo;
    private String fechaPublicacion;
    private String descripcionGeneral;
    private Autor autor;

    public Libro(String titulo, String fechaPublicacion, String descripcionGeneral, Autor autor) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcionGeneral = descripcionGeneral;
        this.autor = autor;

    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public void setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}