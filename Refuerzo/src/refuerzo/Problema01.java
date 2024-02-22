/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        System.out.println("Bienvenido a la pescadería de la ciudad");

       
        double librasCamarón;
        double librasBacalao;

        while (true) {

           
            System.out.print("Ingrese el nombre del pescador o 'salir' para terminar: ");
            String nombre = entrada.nextLine();
            if (nombre.equals("salir")) {
              
                break;
            }
            System.out.print("Ingrese el número de libras de camarón: ");
            librasCamarón = entrada.nextDouble();
            System.out.print("Ingrese el número de libras de bacalao: ");
            librasBacalao = entrada.nextDouble();

            double costoTotal = costoTotal(librasCamarón, librasBacalao);

           
            System.out.println("Pescador: " + nombre);
            System.out.println("Libras de camarón: " + librasCamarón + " - costo $" + (librasCamarón * 1.1));
            System.out.println("Libras de bacalao: " + librasBacalao + " - costo $" + (librasBacalao * 1.2));
            System.out.println("Total a pagar al pescador: $" + costoTotal);
        }

    }

    public static double costoTotal(double librasCamarón, double librasBacalao) {
        double costoCamarón = librasCamarón * 1.1;
        double costoBacalao = librasBacalao * 1.2;
        return costoCamarón + costoBacalao;
    }
}
