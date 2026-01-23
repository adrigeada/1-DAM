package org.example.Bateria_matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una matriz 3x3");

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {

                matriz[i][j] = teclado.nextInt();

            }
        }

        for (int[] fila : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Introduce el número a buscar");
        int num = teclado.nextInt();

        fuera:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == num){
                    System.out.println("El número "+num+ " Se encuentra en la posición ("+i+ ", "+j+ ")");
                    break fuera;
                }

            }
        }





    }
}
