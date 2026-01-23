package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //Desarrolla un programa en Java que permita al usuario generar una secuencia de números
        //en la que cada número es la suma de los dos anteriores, comenzando desde 0 y 1.
        //Si el usuario introduce un 5, la salida debe ser:
        //
        //Secuencia de Números: 0 1 1 2 3
        //
        //Si el usuario introduce un 10, la salida debe ser:
        //Secuencia de Números: 0 1 1 2 3 5 8 13 21 34

        int secuencia = 0;
        int num1 = 0;
        int num2 = 1;
        int resultado = 0;

        System.out.println("introduce num");
        secuencia = teclado.nextInt();

        for (int i=1 ; i<= secuencia ; i++){

            System.out.println(num1);

            resultado = num1+num2;
            num1 = num2;
            num2 = resultado;


        }


    }
}
