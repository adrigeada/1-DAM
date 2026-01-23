package org.example.Bateria_vectores;

import java.util.Arrays;

public class Ejercicio5 {
    static void main() {

        int[] vector = {1,2,3,4,5};
        int[] rotado = new int[vector.length];
        int longitud = vector.length;

        for (int i =0; i<=longitud-1; i++){ //se va a repetir 4 veces, pero en la vuelta 4, cuando i sea igual a longitud, pasa el else.
            if (i<longitud-1){
                rotado[longitud-1-i]= vector[longitud-2-i];//la ultima posicion de rotado es la penultima de vector
            }else {
                rotado[0]= vector[longitud-1];          //cuando i = longitud - 1 (la ultima vuelta), la primera posicion de rotado es la ultima de vector
            }

        }
//        System.out.println(Arrays.toString(rotado));

        int[] vector2 = {1,2,3,4,5};
        int longitud2 = vector2.length;
        int aux2 = 0;

        aux2 = vector[longitud2-1];

        for (int j = longitud2-1; j>=1; j--){

            vector2[j]= vector2[j-1];

        }

        vector2[0]=aux2;


        System.out.println(Arrays.toString(vector2));


    }
}
