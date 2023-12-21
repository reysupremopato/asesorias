/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author USER
 */
public class Suma extends Calculadora{
    
    
    @Override
    public void operacion(int x, int y){
        System.out.println("la suma es " + (x + y));   
        
    }
}
