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
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaObjetos {
    
    private static Cubo cubo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }
    
    static void start() {
        Scanner r = new Scanner(System.in);
        int lado = 0;
        cubo = new Cubo();
        
        System.out.println("----------");
        System.out.println("Ingrese un valor para la medida de los lados:");
        
        try {
            lado = r.nextInt();
            cubo.setLado(lado);
        }
        catch (InputMismatchException e) {
            System.out.println("Debe ingresar un valor numérico.");
            start();
        }
        
        mainMenu();
    }
    
    static void mainMenu() {
        Scanner r = new Scanner(System.in);
        int opcion = 0;
        String info;
        
        System.out.println("------------------------------------------------");
        System.out.println("Medida de los lados: "
                + String.valueOf(cubo.getLado()) + " cm.\n");
        System.out.println("¿Qué desea hacer ahora?");
        System.out.println("1: Calcular el área del cuadrado.");
        System.out.println("2: Calcular el perímetro del cuadrado.");
        System.out.println("3: Calcular el volúmen del cubo.");
        System.out.println("4: Calcular el área lateral del cubo.");
        System.out.println("5: Reiniciar.");
        System.out.println("6: Salir.");
        System.out.println("------------------------------------------------");
        
        try {
            opcion = r.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Debe ingresar un valor numérico");
            mainMenu();
        }
        
        switch (opcion) {
            case 1: // Calcular el área del cuadrado.
                int area = cubo.calcularArea();
                info = "El área del cuadrado es: " + String.valueOf(area)
                        + " cm2.";
                showInfo(info);
            break;
            
            case 2: // Calcular el perímetro de cuadrado.
                int perimetro = cubo.calcularPerimetro();
                info = "El perímetro del cuadrado es: "
                        + String.valueOf(perimetro) + " cm.";
                showInfo(info);
            break;
            
            case 3: // Calcular el volúmen del cubo.
                int volumen = cubo.calcularVolumen();
                info = "El volúmen del cubo es: " + String.valueOf(volumen)
                        + " cm3.";
                showInfo(info);
            break;
            
            case 4: // Calcular el área lateral del cubo.
                int areaLateral = cubo.calcularPerimetroCubo();
                info = "El área lateral del cubo es: "
                        + String.valueOf(areaLateral) + " cm2.";
                showInfo(info);
            break;
            
            case 5: // Reiniciar.
                start();
            break;
            
            case 6:
                
            break;
                
            default:
                System.out.println("Debe seleccionar una"
                        + "de las opciones disponibles.");
                mainMenu();
            break;
        }
    }
    
    static void showInfo(String info) {
        Scanner r = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("---------------------------------------------");
        System.out.println("Medida de los lados: "
                + String.valueOf(cubo.getLado()) + " cm.\n");
        System.out.println(info);
        System.out.println("---------------------------------------------\n");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1: Regresar al menú principal.");
        System.out.println("2: Reiniciar todo.");
        System.out.println("3: Salir.");
        
        try {
            opcion = r.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Debe ingresar un valor numérico.");
            showInfo(info);
        }
        
        switch(opcion) {
            case 1: // Regresar al menú principal.
                mainMenu();
            break;
            
            case 2: // Reiniciar todo.
                start();
            break;
            
            case 3: // Salir;
                
            break;
            
            default:
                System.out.println("Debe seleccionar una "
                        + "de las opciones disponibles.");
                showInfo(info);
            break;
        }
    }
    
}
