package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 5. Programa que pida 5 sueldos de la empresa NTT Data.
        // El programa mostrará el sueldo más alto (sueldo máximo), y cuántos de ellos ganan más de 1.000€.

        double sueldo = 0;
        double sueldomaximo = 0;
        int contador = 0;


        for (int i = 1 ; i<=5 ; i++){

            System.out.println("Escribe un sueldo");
            sueldo = teclado.nextDouble();

            if (sueldo > sueldomaximo){
                sueldomaximo = sueldo;
            }

            if (sueldo >= 1000){
                contador++;
            }


        }
        System.out.println(sueldomaximo);
        System.out.println(contador);

    }
}
