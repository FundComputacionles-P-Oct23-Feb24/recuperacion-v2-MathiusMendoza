/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo;

/**
 *
 * @author A S U S
 */
public class Problema02 {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] equipos = {"Barcelona", "Emelec", "Liga de Quito",
            "Independiente del Valle", "Delfin", "Macará",
            "Deportivo Cuenca", "Orense"};
        int[][] goles = {
            {1, 2, 2, 5},
            {4, 1, 1, 4},
            {8, 0, 1, 3},
            {7, 1, 1, 2},
            {6, 0, 1, 2},
            {5, 2, 1, 1},
            {4, 0, 3, 2},
            {3, 1, 2, 1}
        };

        for (int i = 0; i < equipos.length; i++) {
            presentarReporte(equipos[i], goles[i][0], goles[i][1], goles[i][2],
                    goles[i][3]);
        }
    }

    public static void presentarReporte(String equipo, int p1, int p2, int p3,
            int p4) {
        int puntosA = p1 + p2 + p3 + p4;
        System.out.println(equipo + " con puntos: " + p1 + ", " + p2 + ", "
                + p3 + ", " + p4 + " tiene un total de puntos de " + puntosA);
    }

}
