package org.example.EjerciciosMatrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Escribe las filas de la matriz");
        int n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        //Crear una matriz con numeros aleatorios
        for (int i = 0 ; i< matriz.length ; i++){
            for (int j = 0 ; j<matriz[i].length ; j++){
                matriz[i][j] = aleatorio.nextInt(9)+1;

            }
        }

        //Imprimir la matriz
        for (int i = 0 ; i< matriz.length ; i++){
            for (int j = 0 ; j<matriz[0].length ; j++){

                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        //Imprimir la diagonal con un for
        for (int i = 0 ; i< matriz.length ; i++){

            System.out.print(matriz[i][i]);
        }
        System.out.println();

        //Imprimir la diagonal con dos for y un if
        for(int i = 0; i < matriz.length ; i++){
            for (int j = 0 ; j<matriz[i].length ; j++){
                if (i == j){
                    System.out.print(matriz[i][j]);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i+j == matriz.length-1){
                    System.out.print(matriz[i][j]);
                }

            }

        }












    }
}
