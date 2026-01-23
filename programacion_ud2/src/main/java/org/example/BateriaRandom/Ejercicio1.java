package org.example.BateriaRandom;

import java.util.Random;

public class Ejercicio1 {
    static void main() {
        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6)+1;
        int dado2 = aleatorio.nextInt(6)+1;

        System.out.println("Dado 1: "+dado1);
        System.out.println("Dado 2: " +dado2);
        int resultado = dado1+dado2;
        System.out.println("La suma de los dados es: "+resultado);
    }
}
