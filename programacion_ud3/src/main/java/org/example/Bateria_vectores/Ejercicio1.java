package org.example.Bateria_vectores;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
    static void main() {
        Random aleatorio = new Random();

        int[] vector = new int[8]; //un vector de tamaño 8 numeros int
        int resultado= 0;
        System.out.println(Arrays.toString(vector));

        for (int i = 0; i<vector.length ; i++){
            vector[i]= aleatorio.nextInt(501); //en la posicion i se pone un numero aleatorio del 0 al 500

            resultado+=vector[i];
        }

        System.out.println(Arrays.toString(vector));
        System.out.println(resultado);

    }
}
