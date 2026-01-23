package org.example.Bateria_bucles_anidados;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe la altura");
        int altura = teclado.nextInt();

        for (int i = 1 ; i<=altura ; i++){

            for (int j = 1 ;j<=i ; j++){

                System.out.print("*");
            }
            System.out.println();


        }





    }
}
