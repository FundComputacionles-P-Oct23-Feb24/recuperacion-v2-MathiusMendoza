/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo;

/**
 *
 * @author A S U S
 */
public class Problema04 {

    public static void main(String[] args) {
        // TODO code application logic here
        // itera sobre los terminos que da la serie
        for (int n = 1; n <= 6; n++) {
            // procesa el numero actual con cada iteracion.
            double termino = calcularTermino(n);
            // imprime su termino actual de la serie
            System.out.println("(" + n + "*" + (2 * n) + ")/" + (7 * n) 
                    + " = " + termino);
         
            
        }
    }
    // Funcion que me permite calcular n de una serie.
    public static double calcularTermino(int n){
        return (n*(n+1))/(7*n);
    }
}



