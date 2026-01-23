package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ordenar {
    static void main() {
        Integer[] vector = {4,3,2,5,0};
        Integer[] vector2 = vector.clone();

        Arrays.sort(vector2); //Ordena el vector de manera ascendente

        System.out.println(Arrays.toString(vector2));

        Arrays.sort(vector, Collections.reverseOrder()); //Ordena el vector de manera descendente. Esto necesita que el vector sea Integer, no int.

        System.out.println(Arrays.toString(vector));

        int posicion = Arrays.binarySearch(vector2,3); //si esto sale un numero negativo, es porque el numero que buscas no está en el vector. O porque el vector tiene que ser int no Integer
        System.out.println(posicion); //En que posicion está el numero 3 en el vector2. {0,2,3,4,5}








    }
}
