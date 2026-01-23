package org.example;

import java.util.Scanner;

public class test_hasnextInt {
    static void main() {
        Scanner teclado = new Scanner(System.in);


                if (teclado.hasNextInt()) {

                    int numero = teclado.nextInt();

                    System.out.println("Número entero: " + numero);

                } else {

                    System.out.println("No es un entero válido.");

                }



    }
}
