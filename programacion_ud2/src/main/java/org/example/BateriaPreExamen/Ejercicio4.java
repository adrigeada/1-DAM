package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 4. Programa que pida al usuario una una nota numérica (redondeada) y devuelva su equivalencia cualitativa así:

        System.out.println("Escribe la nota");
        float nota = teclado.nextFloat();
        int notaint = 0;

        if (nota <= 4 && nota >= 0){
            notaint = 1;
        } else if (nota>=5 && nota < 6) {
            notaint = 2;
        } else if (nota>=6 && nota < 7) {
            notaint = 3;
        } else if (nota>= 7 && nota < 9) {
            notaint = 4;
        } else if (nota >= 9 && nota <= 10) {
            notaint = 5;
        }else if (nota < 0 || nota > 10){
            System.out.println("no válido");
        }

        switch (notaint){
            case 1:
                System.out.println("Insuficiente");
                break;
            case 2:
                System.out.println("Suficiente");
                break;
            case 3:
                System.out.println("Bien");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;

        }


    }
}
