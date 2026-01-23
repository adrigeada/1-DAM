package org.example.BateriaRandom;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Pon el rango mínimo");
        int min = teclado.nextInt();
        System.out.println("Pon el rango max");
        int max = teclado.nextInt();

        if (min>max){
            System.out.println("El rango minimo tiene que ser mayor que el máximo");
            return;
        }

        System.out.println("Cuantos numeros aleatorios quieres?");
        int cantidad = teclado.nextInt();

        int numero = 0;

        for (int i = 0; i<cantidad; i++){

            numero = aleatorio.nextInt(max - min + 1) + min;
            System.out.println(numero);
        }



    }
}
