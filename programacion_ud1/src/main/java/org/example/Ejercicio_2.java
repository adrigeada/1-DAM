package org.example;

import java.util.Scanner;

public class Ejercicio_2 {
    static void main() {

// Ejercicio 2. Reescribe el programa anterior para darle al empleado 1.5 veces la tarifa horaria para todas las horas trabajadas que excedan de 40.

        Scanner teclado = new Scanner(System.in);
        final double JORNADA = 40;
        final double PLUS_EXTRA = 1.5;  // CONSTANTES!


        System.out.println(" ¿Cuantas horas trabajas a la semana? ");
        Double horas = teclado.nextDouble();

        System.out.println(" ¿Cuanto cobras por hora? ");
        Double tarifa = teclado.nextDouble();

        if (horas > JORNADA) {

            double extra = horas - JORNADA; //45 - 40
            double tarifa_extra = tarifa * PLUS_EXTRA; //10 * 1.5
            double salario_extra = extra * tarifa_extra; //5 * 15

            System.out.println(" Salario con extra: " + (salario_extra + JORNADA * tarifa) + "€");


        } else{
                Double resultado = (horas * tarifa);
                System.out.println("Tu salario bruto al día es: " + resultado);

            }

    }
}
