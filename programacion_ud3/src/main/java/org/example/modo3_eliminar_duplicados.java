package org.example;

import java.util.Arrays;
import java.util.Random;

public class modo3_eliminar_duplicados {
    static void main() {
        Random aleatorio = new Random();


         int[] numeros = new int[10];

         for (int i = 0; i< numeros.length ; i++){
             numeros[i]= aleatorio.nextInt(10)+1;
         }

        System.out.println(Arrays.toString(numeros));


         boolean comprobar = true;

        while (comprobar){

            comprobar = false;

            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));

            for (int i = 0; i<numeros.length; i++){

                if (i!= numeros.length-1 && numeros[i] == numeros[i+1]){
                    System.out.println("duplicado: "+ numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(10)+1;
                    comprobar = true;
                }
            }

        }


        System.out.println(Arrays.toString(numeros));



    }
}
