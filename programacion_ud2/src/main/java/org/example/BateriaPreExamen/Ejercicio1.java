package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
//Ejercicio 1. Programa que pida por teclado una cantidad de números a introducir (N). Una vez introducidos, el programa debe informar de cuántos números son:
//- mayores que 0.
//- menores que 0.
//- iguales a 0.

        System.out.println("Cuantos números quieres introducir?");
        int cantidad = teclado.nextInt();
        int mayor = 0;
        int menor= 0;
        int igual = 0;

        for (int i= 1; i<= cantidad; i++ ){
            System.out.println("Introduce un número");
            int num = teclado.nextInt();

            if (num > 0){
                mayor++;
            } else if (num < 0) {
                menor++;
            }else {
                igual++;
            }

        }
        System.out.println("Hay " +mayor+ " " + (mayor == 1 ? "número mayor": "números mayores")+ " a 0" );
        System.out.println("Hay " +menor+ " números menores a 0");
        System.out.println("Hay " +igual+ " números iguales a 0");
    }
}
