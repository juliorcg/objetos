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
public class Cuadrado {
    private int lado = 0;
    
    public Cuadrado() {
        this.lado = 0;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int getLado() {
        return this.lado;
    }
    
    public int calcularArea() {
        return (int) Math.pow(this.lado, 2);
    }
    
    public int calcularPerimetro() {
        return this.lado * 4;
    }
}
