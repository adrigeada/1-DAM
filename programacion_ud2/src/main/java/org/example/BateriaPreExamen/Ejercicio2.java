package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 2. Programa que dados dos números introducidos por teclado, uno real (base) -que puede ser positivo
        // o negativo- y un entero positivo (exponente), saque por pantalla el resultado de la potencia. Por ejemplo: 56

        System.out.println("Escribe la base");
        int base = teclado.nextInt();
        int resultado = 1;

        System.out.println("Escribe el exponente");
        int exponente = teclado.nextInt();

        for (int i = 1 ; i<=exponente ; i++){
            resultado *= base;
        }
        System.out.println(resultado);

    }
}
