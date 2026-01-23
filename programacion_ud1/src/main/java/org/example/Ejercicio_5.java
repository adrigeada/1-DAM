package org.example;
// Ejercicio 5. Realizar un programa para dividir dos números leídos por teclado
// y escribir el resultado. Se debe controlar que el divisor no sea igual a 0 e
// informaremos con el siguiente mensaje: "ERROR: no se puede dividir entre 0".

import java.util.Scanner;

public class Ejercicio_5{
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean repetir = true;

        do {
            try {
                System.out.println("Escribe un número: ");
                num1 = teclado.nextDouble();
                System.out.println("Escribe otro número: ");
                num2 = teclado.nextDouble();
                repetir = false;
            } catch (Exception e) {
                System.out.println("El formato tiene que ser numérico");
            }
            teclado.nextLine(); // para parar el loop porque sino no para de decir que el formato tiene que ser numerico.
        }while (repetir==true);



        if (num2 == 0 ) {
            System.out.println("ERROR: no se puede dividir entre 0 ");

        }else {System.out.println("El resultado es: " + num1 / num2);

        }
    }
}
