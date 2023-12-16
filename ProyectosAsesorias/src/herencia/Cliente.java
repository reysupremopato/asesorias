/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author USER
 */
public class Cliente extends Persona {

    private Integer metodoDePago;
    private Integer numeroCliente;

    public Cliente(Integer metodoDePago, Integer numeroCliente, String nombre, int edad, String apellido) {
        super(nombre, edad, apellido);
        this.metodoDePago = metodoDePago;
        this.numeroCliente = numeroCliente;
    }

    public Integer getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(Integer metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

}
