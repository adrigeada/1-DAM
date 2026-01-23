package org.example;

import java.util.Scanner;

public class Ejercicio_1 {

    // Ejercicio 1. Escribe un programa para pedirle al usuario el número de horas y la tarifa por hora para calcular el salario bruto.
    static void Prueba () {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" ¿Cuantas horas trabajas al dia? ");
        double horas = teclado.nextDouble();

        System.out.println(" ¿Cuanto cobras por hora? ");
        double tarifa = teclado.nextDouble();

        double resultado = (horas * tarifa);
        System.out.println("Tu salario bruto al día es: " + resultado);


    }




}
