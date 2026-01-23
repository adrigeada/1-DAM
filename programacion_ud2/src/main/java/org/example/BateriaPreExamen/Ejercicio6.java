package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int cantidad = 0;
        int edad = 0;
        int altura = 0;
        int edadmedia = 0;
        int alturamedia= 0;
        int contadoraltura = 0;
        int contadoredad = 0;

        System.out.println("Cuantos alumnos vas a introducir");
        cantidad = teclado.nextInt();

        for (int i = 1; i <=cantidad; i++){

            System.out.println("Introduce la edad del "+i+ "º niño");
            edad = teclado.nextInt();
            edadmedia += edad;

            System.out.println("Introduce la altura "+i+ "º niño" );
            altura = teclado.nextInt();
            alturamedia += altura;

            if (edad >= 18){
                contadoredad++;
            }
            if (altura >= 175){
                contadoraltura++;
            }



        }

        System.out.println("La edad media es: "+edadmedia/cantidad);
        System.out.println("la altura media es: "+alturamedia/cantidad);
        System.out.println("Hay "+contadoredad+ " niños mayores de 18");
        System.out.println("Hay "+contadoraltura+ " niños que miden mas de 175cm");


    }
}
