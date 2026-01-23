package org.example.Bateria_matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos alumnos quieres introducir?");
        int alumnos = teclado.nextInt();
        System.out.println("Cuantas asignaturas?");
        int asignaturas = teclado.nextInt();

        teclado.nextLine(); //entre que pide int y que pide Line para que no pete

        String[][] matriz = new String[alumnos+1][asignaturas+1];

        matriz[0][0] = "Estudiantes";


        for (int i = 1; i < matriz.length; i++) {
            System.out.println("Introduce alumno");
            matriz[i][0] = teclado.next();
        }


        for (int i = 1; i < matriz[0].length; i++) {
            System.out.println("Escribe asignaturas");
            matriz[0][i] = teclado.next();
        }

        for (String[] fila : matriz){
            System.out.println(Arrays.toString(fila));
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.println("Pon nota para el alumno "+ matriz[i][0]+ " Para la asignatura de "+matriz[0][j]+ ":");
                matriz[i][j] = teclado.next();

            }
        }

        for (String[] fila : matriz){
            for (String columna : fila){
                System.out.print(columna + " ") ;
            }
            System.out.println();
        }

        double sumanotas = 0;
        for (int i = 1; i < matriz.length; i++) {
            sumanotas = 0;
            for (int j = 1; j < matriz[i].length; j++) {

                sumanotas += Integer.parseInt(matriz[i][j]);

            }

            System.out.println("Nota media de alumno " + matriz[i][0] + " es " +  (sumanotas/asignaturas));

        }

        for (int i = 1; i < matriz[0].length; i++) {
            sumanotas = 0;
            for (int j = 1; j < matriz.length; j++) {

                sumanotas += Integer.parseInt(matriz[j][i]);

            }

            System.out.println("La nota media en la asignatura " +matriz[0][i] + " es " + (sumanotas/alumnos));
        }


    }
}
