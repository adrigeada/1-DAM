package org.example;

import java.util.Arrays;

public class Matrices {
    static void main() {

        int[][] matriz = {{0,1,2},{3,4,5},{6,7,8}};

        int matriz2[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }


        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);

        for (int fila = 0 ; fila < matriz.length ; fila++){

            for (int columna = 0 ; columna < matriz[0].length ; columna++){

                System.out.print(matriz[fila][columna]);
            }
            System.out.println();

        }

        for (int[] fila : matriz){
            System.out.println(Arrays.toString(fila));
        }

        for (int[] fila : matriz){
            for (int coulmna : fila){
                System.out.print(coulmna);
            }
            System.out.println();
        }

        int[] vector = {1,2,3,4};

        for (int num : vector){ //for each. trae elementos
            System.out.println(num);
        }



//        int tam = matriz.length;
//
//        System.out.println(tam);










    }
}
