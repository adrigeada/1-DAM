package org.example.Bateria_matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    static void main() {
        Random aleatorio = new Random();

        int[][] matriz = new int[aleatorio.nextInt(5)+1][aleatorio.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(9)+1;
                System.out.print(matriz[i][j]+ " ");

            }
            System.out.println();
        }

        int resultado = 0;

        for (int i = 0; i < matriz.length; i++) {
            resultado=0;
            for (int j = 0 ; j < matriz[i].length ; j++){

                resultado += matriz[i][j];

            }
            System.out.println("Fila "+(i+1)+"= "+resultado);
        }
        int resultado2 = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            resultado2=0;
            for (int j = 0 ; j < matriz.length ; j++){

                resultado2 += matriz[j][i];

            }
            System.out.println("columna "+(i+1)+"= "+resultado2);
        }


    }
}
