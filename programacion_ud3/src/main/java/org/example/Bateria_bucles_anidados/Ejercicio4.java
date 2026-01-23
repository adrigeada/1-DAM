package org.example.Bateria_bucles_anidados;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el numero máximo");
        int m = teclado.nextInt();

        primos:
        for (int i = 2 ; i <= m ; i++){

            for (int j = 2 ; j<i ; j++){ //si i es divisible entre j, no es primo y vuelve al principio del primer for.

                if (i % j == 0){
                    continue primos;
                }

            }

            System.out.println(i);
        }






    }
}
