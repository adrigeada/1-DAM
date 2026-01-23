package org.example.Bateria_vectores;

import java.util.Arrays;

public class Ejercicio2 {
    static void main() {
        int[] vector = {1,2,3,4,5};
            int aux=0;
       for (int i = 0; i< vector.length/2; i++){ //nos guardamos la primera posicion para poder cambiarla con la ultima. Se hace length/2 para que se haga solo hasta la mitad, porque si se hiciera entero el numero quedaria igual que al principio
           aux = vector[i];                         //coge el primero lo cambia por el ultimo
           vector[i]= vector[vector.length-1-i];
           vector[vector.length-1-i]= aux;          //coge el ultimo y lo cambia por el primero que nos hemos guardado antes
       }

        System.out.println(Arrays.toString(vector));



    }

}
