/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionOrientadaObjetos;

/**
 *
 * @author USER
 */
public class EscuelaMain {
    public static void main(String[] args) {
        Tutor tutor1= new Tutor();
        tutor1.setCalendario("ccalendario1");
        tutor1.setCantidadAlumnos(1);
       Alumno alumno1= new Alumno();
       alumno1.setGrupo("A");
       alumno1.setNombre("juan");
       alumno1.setTutor(tutor1);
        System.out.println("grupo :" + alumno1.getGrupo());
        System.out.println(alumno1.getTutor().getCantidadAlumnos());        
    }
    
}
