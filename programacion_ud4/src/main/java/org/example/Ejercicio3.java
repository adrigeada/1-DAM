package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String cadena = teclado.nextLine();
        String nueva = pasarMayuscula(cadena);
        System.out.println(nueva);
        int contador = contarVocales(nueva);
        System.out.println(contador);

    }

    public static String pasarMayuscula(String cadena){

        String nueva = cadena.toUpperCase();
        return nueva;
    }

    public static int contarVocales(String nueva){

        String[] vector_frase = nueva.split("");
        int contador = 0;

        for (int i = 0; i < vector_frase.length; i++) {
            if (vector_frase[i].equals("A") || vector_frase[i].equals("E") || vector_frase[i].equals("I") || vector_frase[i].equals("O") || vector_frase[i].equals("U") ){
                contador++;
            }
        }
        return contador;



    }



}
