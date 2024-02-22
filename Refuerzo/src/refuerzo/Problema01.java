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
        
        // A continuacion se crea un ciclo donde me permite ingresar varios 
        // pescadores dependiendo de las respuesta del ususario.
        
        while (true) {

           
            System.out.print("Ingrese el nombre del pescador o 'salir' para terminar: ");
            String nombre = entrada.nextLine();
            // Si el ususario ya no descea ingresar mas pescadores, sale del ciclo.
            if (nombre.equals("salir")) {
              
                break;
            }
            // Ingresa datos 
            System.out.print("Ingrese el número de libras de camarón: ");
            librasCamarón = entrada.nextDouble();
            System.out.print("Ingrese el número de libras de bacalao: ");
            librasBacalao = entrada.nextDouble();
            
            // Se llama a la funcion para calcular el total a pagar lbCamaron 
            // y lbBacalao alamacenandolo en una vriable de tipo double.
            double costoTotal = costoTotal(librasCamarón, librasBacalao);

            //Se presenta el reporte
            System.out.println("Pescador: " + nombre);
            System.out.println("Libras de camarón: " + librasCamarón 
                    + " - costo $" + (librasCamarón * 1.1));
            System.out.println("Libras de bacalao: " + librasBacalao 
                    + " - costo $" + (librasBacalao * 1.2));
            System.out.println("Total a pagar al pescador: $" + costoTotal);
        }

    }
    // Se crea una funcion que permita calcular el costo total para pagar al Pescador 
    public static double costoTotal(double librasCamarón, double librasBacalao) {
        double costoCamarón = librasCamarón * 1.1;
        double costoBacalao = librasBacalao * 1.2;
        return costoCamarón + costoBacalao;
    }
}
