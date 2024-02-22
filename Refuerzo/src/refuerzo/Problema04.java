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
        int num = 1;

        while (num <= 6) {
            double termino = calcularTermino(num);
            System.out.println("(" + num + "*" + (2 * num) + ")/" + (7 * num) 
                    + " = " + termino);
            num++;
        }
    }

    public static double calcularTermino(int n) {
        return (n * (n + 1)) / (7 * n);
    }
}
