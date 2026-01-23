package org.example;

import java.util.Scanner;

public class Modo1 {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
        }

    }

    public static void casoDePrueba() {

        int vector[] = new int[6];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }
        int resultado = (vector[0] * vector[1]* vector[2]) - (vector[3]*vector[1]*2) - (vector[4]+vector[5]);
        System.out.println(resultado);


    } // casoDePrueba
}
