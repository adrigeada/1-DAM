package org.example;

import java.util.Scanner;

public class Modo3 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {
            int trenes = teclado.nextInt();
            int[] vector = new int[trenes];
            int contador = 1;

            for (int i = 0; i < vector.length; i++) {
                vector[i] = teclado.nextInt();
            }


            for (int i = 0; i < vector.length; i++) {
                if ( i != vector.length-1 && vector[i]<vector[i+1] ){
                    contador++;
                }
            }
            System.out.println(contador);


            return true;
        }
    }


}
