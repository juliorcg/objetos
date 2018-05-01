/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaobjetos;

/**
 *
 * @author Julio Chan
 */
public class Cubo extends Cuadrado {
    private int volumen;
    private int perimetro;
    
    public Cubo() {
        this.volumen = 0;
        this.perimetro = 0;
    }
    
    public int calcularVolumen() {
        return (int) Math.pow(this.getLado(), 3);
    }
    
    public int calcularPerimetroCubo() {
        return 6 * (int) Math.pow(this.getLado(), 2);
    }
}
