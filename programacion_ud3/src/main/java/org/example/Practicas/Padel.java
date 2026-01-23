package org.example.Practicas;

import java.util.Arrays;
import java.util.Scanner;

public class Padel {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el porcentaje de los valores externos");
        String puntos = teclado.nextLine();
        String[] puntos_vec = new String[4];
        int[] vector_int = new int[puntos_vec.length];
        int suma = 0;
        int resultado = 0;

        boolean formato = puntos.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}");

        if (formato){
            puntos_vec = puntos.split("-");
            System.out.println(Arrays.toString(puntos_vec));
        }else {
            System.out.println("mal");
        }

        for (int i = 0; i < puntos_vec.length; i++) {

            vector_int[i] = Integer.parseInt(puntos_vec[i]);

            if (vector_int[i] < 1 || vector_int[i] > 90){
                System.out.println("Los números tienen que estar entre 1 y 90");
                break;
            }

            suma += vector_int[i];

        }
        System.out.println(suma);

        if (suma < 100){

            resultado = 100-suma;
            System.out.println("Tienes un "+resultado+"% de culpa");

        }else {
            System.out.println("La suma de los datos no puede ser mayor a 100");
        }















    }
}
