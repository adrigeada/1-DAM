package org.example.BateriaBucles;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = teclado.nextLine();
        int longitud = palabra.length();

        for (int i = 0 ; i<= longitud-1 ; i++){
            System.out.println(palabra.charAt(i));
        }




    }
}
