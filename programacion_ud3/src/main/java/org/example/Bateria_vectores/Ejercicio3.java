package org.example.Bateria_vectores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("pon un numero");
        int num = teclado.nextInt();
        int contador = 0;

        int[] vector = new int[25];

        for (int i = 0; i< vector.length; i++){

            vector[i]= aleatorio.nextInt(21);
            if (num == vector[i]){
                contador++;
            }

        }
        System.out.println("El numero"+num+ "sale :"+contador+" veces");
        System.out.println(Arrays.toString(vector));





    }
}
