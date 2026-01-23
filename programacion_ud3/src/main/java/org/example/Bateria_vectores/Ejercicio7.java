package org.example.Bateria_vectores;

import java.util.Arrays;

public class Ejercicio7 {
    static void main() {
        int vector1[]= {1,2,3,8,9};
        int vector2[]= {4,5,6};
        int vector_junto[]= new int[vector1.length+ vector2.length];

        for (int i = 0; i< vector1.length; i++){
            vector_junto[i]=vector1[i];
        }
        System.out.println(Arrays.toString(vector_junto));

        for (int i = 0; i< vector2.length; i++){
            vector_junto[vector1.length+i]=vector2[i];
        }
        System.out.println(Arrays.toString(vector_junto));

    }
}
