package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// Ejercicio 3. Realizar un programa que pida un número al usuario, que deberá introducirlo usando el teclado.
// El algoritmo debe identificar si el número introducido se trata de un número positivo (>0) o un número negativo (<0)
// y controlar el caso particular del número 0, que es natural.
public class Ejercicio_3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        boolean repetir = false;

        do {
            System.out.println("Esribe un número: ");
            try {
                num1 = teclado.nextInt();
                repetir = true;
            } catch (Exception e) {
                System.out.println("Tiene que ser formato numérico");
            }
            teclado.nextLine();
        }while (repetir == false);


            if (num1 > 0) {
            System.out.println("Tu número es positivo ");


            }else if (num1 == 0 ){
            System.out.println("Tu número es natural ");

             }else {
            System.out.println("Tu numero es negativo ");
            }

    }

}