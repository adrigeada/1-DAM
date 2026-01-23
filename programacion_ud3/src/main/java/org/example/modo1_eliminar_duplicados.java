package org.example;

import java.util.Arrays;

public class modo1_eliminar_duplicados {
    static void main() {
//modo 1 Eliminar duplicados usando un vector auxiliar y copiando elementos limpios a un vector nuevo

        int[] vector_original = {0,1,2,2,3,4,4,5};
        int[] vector_aux = new int[vector_original.length];

        int j = 0;


        for (int i = 0; i < vector_original.length; i++){

            if (i== vector_original.length-1){

                vector_aux[j]= vector_original[i];
                j++;

            }else if (vector_original[i] != vector_original[i+1]){
                vector_aux[j] = vector_original[i];
                j++;
            }

        }

        System.out.println(j);
        System.out.println(Arrays.toString(vector_aux));
        int[] vector_limpio = new int[j];

        System.out.println(Arrays.toString(vector_aux));

        for (int k = 0; k< vector_limpio.length; k++){

            vector_limpio[k] = vector_aux[k];

        }
        System.out.println(Arrays.toString(vector_limpio));



    }
}
