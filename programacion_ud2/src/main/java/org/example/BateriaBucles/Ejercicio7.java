package org.example.BateriaBucles;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String palabra2 = "";

        System.out.println("Introduce una palabra");
        String palabra = teclado.next();
        int letras = palabra.length();

        for (int i=letras-1 ;i>=0 ;i--){        //i = 0 porque es la posicion inicial de la palabra.

            palabra2 += palabra.charAt(i);

        }
        System.out.println(palabra2);

    }
}
