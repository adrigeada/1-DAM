package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Aapuntes {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //VECTORES
        String frase = "";
        int[] vector = {1,2,3,4};
        String[] vector2 = {"esto","es","un", "vector"};
        String[] vector3 = new String[5];
        Integer[] vector4 = new Integer[5];
        //Imprimir vector
        System.out.println(Arrays.toString(vector));

        //Rellenar un vector
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = teclado.next();
        }

        //SPLIT coge un String con separadores y lo pasa a vector
        vector3 = frase.split("/");
        //Si quieres un split de lo que mete por teclado
        vector3 = teclado.next().split("/"); //Lo introducido por teclado separado por el separador se convierte en vector

        //CONTAINS
        boolean contains = Arrays.asList(vector3).contains("a"); //el vector contiene la letra a?  true or false
        boolean contieneint = Arrays.asList(vector4).contains(1); //Si se quiere hacer con int se necesita Integer

        //SORT
        Arrays.sort(vector2); //Ordena el vector de manera ascendente
        Arrays.sort(vector4, Collections.reverseOrder()); //Ordena el vector de manera descendente. Esto necesita que el vector sea Integer, no int.

        //BINARY SEARCH
        int posicion = Arrays.binarySearch(vector,3);//En que posicion está el numero 3 en el vector4. Empezando desde 0

        //ELIMINAR DUPLICADOS
        int[] vectorlimpio = Arrays.stream(vector).distinct().toArray();

        //MATCHES
        frase.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d"); //devuelve true or false. Se hace a un String, no a un vector de String
        // linea[j].matches("[A-O]")




    }
}
