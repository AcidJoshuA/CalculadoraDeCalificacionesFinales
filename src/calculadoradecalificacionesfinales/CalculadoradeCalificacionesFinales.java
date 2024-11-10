/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradecalificacionesfinales;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class CalculadoradeCalificacionesFinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar calificacion de parciales: ");
    double parciales = scanner.nextDouble();
    if (parciales < 0 || parciales > 100){
    System.out.println("La calificacion debe estar entre 0 y 100: ");
    return; 
    }      
    System.out.print("Ingresar calificacion de proyecto: ");
    double proyecto = scanner.nextDouble(); 
    if (proyecto < 0 || proyecto > 100) {
    System.out.println("La calificacion debe estar entre 0 y 100.");
    return;  
    }       
    System.out.print("Ingresar calificacion de examen final entre 0 y 100: ");
    double examenFinal = scanner.nextDouble();
    if (examenFinal < 0 || examenFinal > 100){
    System.out.println("La calificacion de examen final debe estar entre 0 y 100.");
    return; 
    }
    double notaFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
    System.out.println("La calificacion es: " + notaFinal);
    scanner.close();
    }
}
    
