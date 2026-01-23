package org.example.Bateria_bucles_anidados;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el número máximo:");
        int maximo = teclado.nextInt();

        tabla:
        for (int i = 1 ; i<=9 ; i++){

            System.out.println("Tabla del " +i);

            for (int j = 1 ; j<=10 ; j++){
                System.out.println(i + " x " + j + " = " + (i*j));

                if ((i*j)>=maximo){
                    break tabla;

                }

            }


        }






    }
}
