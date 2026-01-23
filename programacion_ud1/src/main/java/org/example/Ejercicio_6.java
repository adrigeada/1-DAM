package org.example;

import java.util.Scanner;

// Calcular area de triangulo
public class Ejercicio_6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;

        try {
            do {
                System.out.println(" Escribe la base del triangulo: ");
                base = teclado.nextDouble();
                if (base <= 0) {
                    System.out.println("La base debe ser un numero mayor que 0. ");
                } else do {
                    System.out.println(" Escribe la altura del triangulo: ");
                    altura = teclado.nextDouble();
                    if (altura <= 0) {
                        System.out.println("La altura debe ser un numero mayor que 0. ");
                    } else {
                        double resultado = (base * altura) / 2;
                        System.out.println("EL area del triangulo es: " + resultado);
                    }

                }while (altura <= 0) ;

            } while (base <= 0);

        } catch (Exception e) {
            System.out.println("El formato tiene que ser numérico.");
        }






        }
    }
