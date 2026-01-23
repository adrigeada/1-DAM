package org.example.Bateria_vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String[] vector = {"me", "cago", "en", "los", "vectores", "de", "los", "cojones"};

        System.out.println("Escribe una letra");
        char letra = teclado.next().charAt(0); //para pedir un char por teclado hay que hacerlo asi

        for (int i = 0; i<vector.length; i++){

            if (vector[i].charAt(0)== letra ){
                System.out.println(vector[i]);
            }
        }



    }
}
