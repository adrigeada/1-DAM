package org.example.Bateria_vectores;

import java.util.Arrays;

public class Ejercicio8 {
    static void main() {
        int[] vector = {1,2,3,5};
        int[] vector_mod= new int[vector.length+1];
        int posicion = 3;
        int num = 4;

        for (int i = 0,j=0; i< vector_mod.length; i++){

        if (i==posicion){
            vector_mod[i]=num;
        }else {
            vector_mod[i]= vector[j]; //cuando salta el if la j no sube +1 pero la i si, entonces en la ultima vuelta
            j++;                      //la posicion 4 de vector_mod = posicion 3 de vector
        }

        }
        System.out.println(Arrays.toString(vector_mod));

    }
}
