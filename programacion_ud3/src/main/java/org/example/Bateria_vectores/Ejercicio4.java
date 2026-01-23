package org.example.Bateria_vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int[] vector = {2,5,7,8,9};
        int[] vector2 = new int[vector.length-1];

        System.out.println(Arrays.toString(vector));
        System.out.println("Escribe una posicion");
        int posicion = teclado.nextInt();

        for (int i = 0; i< vector2.length ; i++){

            if (i>=posicion){
                vector2[i] = vector[i+1];
            }else {
                vector2[i] = vector[i];
            }


            System.out.print(vector[i]);

        }
        System.out.println(Arrays.toString(vector2));


    }
}
