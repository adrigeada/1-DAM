package org.example;

import java.util.Scanner;

public class pruebaexamen {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        float num1, num2, num3;


        do { System.out.println("Escribe un numero del 0 al 10 ");
            num1 = teclado.nextFloat();
            System.out.println("Escribe un numero del 0 al 10 ");
            num2 = teclado.nextFloat();
            System.out.println("Escribe un numero del 0 al 10 ");
            num3 = teclado.nextFloat();
            if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10){
                System.out.println(" El numero tiene que estar entre el 1 y el 10 ");
            }


        }while(num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10);





    }
}
