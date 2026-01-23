package org.example.BateriaBucles;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe numero");
        int cantidad = teclado.nextInt();
        int resultado = 0;


        for (int i =1; i<=cantidad; i++ ){

            System.out.println("Inserta numero "+i);
            int num = teclado.nextInt();
            resultado +=num;
        }
        System.out.println(resultado);

    }
}
