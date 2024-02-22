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
        // TODO code application logic here}

        for (int i = 1; i <= 6; i++) {
            int numerador = i * 2;
            int denominador = i * 7;
            double termino = (double) numerador / denominador;
            System.out.println("(" + numerador + "*" + (i * 2) + ")/" + denominador + " = " + termino);
        }
    }

}
