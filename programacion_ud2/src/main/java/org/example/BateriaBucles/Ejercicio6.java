package org.example.BateriaBucles;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos números quieres sumar?");
        int sumas = teclado.nextInt();
        int resultado = 0;

        for (int i = 1; i<=sumas; i++){
            System.out.println("inserta numero" +i);
            int num1 = teclado.nextInt();
            resultado += num1;

        }
        System.out.println(resultado);




    }
}
