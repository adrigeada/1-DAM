package org.example.Bateria1;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //EJERCICIO 2. Desarrolla un programa que permita leer 2 cadenas
        // de caracteres (palabras) diferentes y nos diga cual es la más larga.

        System.out.println("Escribe dos palabras y te diremos cual es más larga");
        String palabra1 = teclado.nextLine();
        String palabra2 = teclado.nextLine();

        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();

        if (longitud1 > longitud2){
            System.out.println("La primera palabra es mayor");
        }else {
            System.out.println("La segunda palabra es mayor");
        }

        System.out.println(longitud1);
        System.out.println(longitud2);
    }
}
