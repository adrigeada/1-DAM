package org.example.split;

import java.util.Scanner;

public class split_navidad {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir");
        String palabra = teclado.next();
        teclado.nextLine();
        String[] vector_palabra= palabra.split("");

        System.out.println("Inserta la cantidad de letras a imprimir");
        String cantidad = teclado.nextLine();
        String[] cantidad_vector = cantidad.split(" ");

        if (vector_palabra.length == cantidad_vector.length){

            //Hay dos for. El primero recorrerá la palabra introducida por teclado. En la primera letra, pasa al siguiente for
            // y ese for se repite tantas veces como la posicion del primer segundo vector.

            for (int i = 0 ; i< vector_palabra.length ; i++){

                for (int j = 0; j<Integer.parseInt(cantidad_vector[i]) ; j++){

                    System.out.print(vector_palabra[i]);

                }

            }

        }else {
            System.out.println("La palabra y las cifras introducidas no coinciden");
        }



    }
}
