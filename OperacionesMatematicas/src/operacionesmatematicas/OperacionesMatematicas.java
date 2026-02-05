/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesmatematicas;

/**
 *
 * @author lawre
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        double num1 = 10.5;
        double num2 = 5.0;

        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        
        System.out.println("Resultados de la operación entre " + num1 + " y " + num2 + ":");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}