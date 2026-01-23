package org.example.EjerciciosMatrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    static void main() {
        Random aleatorio = new Random();

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz_final = new int[3][3];

        for (int i = 0; i < matriz1.length ; i++) {
            for (int j = 0; j <matriz1[i].length ; j++) {
                matriz1[i][j] = aleatorio.nextInt(15)+1;
            }
        }

        for (int i = 0; i < matriz2.length ; i++) {
            for (int j = 0; j <matriz2[i].length ; j++) {
                matriz2[i][j] = aleatorio.nextInt(15)+1;
            }
        }


        for (int[] fila : matriz1){
            System.out.println(Arrays.toString(fila));
        }

        for (int[] fila : matriz2){
            System.out.println(Arrays.toString(fila));
        }

        for (int i = 0; i < matriz_final.length ; i++) {
            for (int j = 0; j <matriz_final[i].length ; j++) {
                if (matriz1[i][j] > matriz2[i][j]){
                    matriz_final[i][j] = matriz1[i][j];
                }else {
                    matriz_final[i][j] = matriz2[i][j];
                }
            }
        }

        for (int[] fila : matriz_final){
            System.out.println(Arrays.toString(fila));
        }


    }
}
