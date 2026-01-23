package org.example;

import java.util.Scanner;

public class ej2Recursividad {
    static int limite = 10;

    static void main() {

        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();


        contar(1);

        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");

        inicioEjecucion = System.nanoTime();
        memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        contar_bucle();

        finEjecucion = System.nanoTime();
        memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo bucle: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida bucle: " + (memoriaDespues - memoriaAntes) + " bytes");

//        System.out.println(sumar(1));

    }

    public static void contar_bucle(){

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }

    static void contar (int inicio){

        if (inicio <= limite){
            System.out.println(inicio);
            contar(inicio+1);
        }

    }

    static int sumar (int num) {

        if (num < limite){
            num += sumar(num+1);
        }

        return num;
    }

}
