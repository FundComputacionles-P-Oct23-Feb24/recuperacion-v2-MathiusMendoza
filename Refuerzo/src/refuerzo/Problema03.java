/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo;

/**
 *
 * @author A S U S
 */
public class Problema03 {

    public static void main(String[] args) {
        // TODO code application logic here}
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] ventaNumeroTelevisores = {100, 130, 150, 200, 100, 190, 200, 200,
            300, 100, 400, 1000};
        int[] ventaNumeroCelulares = {20, 30, 22, 50, 100, 35, 90, 80, 10,
            40, 50, 60};

        System.out.println("El reporte de meses es:");
        // Este ciclo me permite iterar en el arreglo meses y las ventas C,
        // verificando si el numeroC es menor o igual a 35.
        // Se llama a la funcion para obtener su cadena y presentar.
        for (int i = 0; i < meses.length; i++) {
            if (ventaNumeroCelulares[i] <= 35) {
                System.out.println(generarDatos(meses[i],
                        ventaNumeroTelevisores[i], ventaNumeroCelulares[i]));
            }
        }
    }

    // Se crea la funcion para poder enviar los datos al metodo principal.
    public static String generarDatos(String mes, int numTelevisores,
            int numCelulares) {
        return mes + ": televisores " + numTelevisores + " - celulares "
                + numCelulares;
    }

}
