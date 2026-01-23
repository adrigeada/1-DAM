package org.example;

import java.util.Scanner;

public class Ejercicio2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        imprimirMenu();

        System.out.println("Teclea tu opción:");
        char opcion = teclado.next().charAt(0);

        if (validarOpcion(opcion)){//esto devuelve true o false
            System.out.println("Valido");
        }else {
            System.out.println("No es valida");
        }


    }

    public static void imprimirMenu(){

        System.out.println("Bienvenido!");
        System.out.println("1. Cantar");
        System.out.println("2. Bailar");
        System.out.println("3. Hacer un backflip");
        System.out.println("X. Salir");

    }

    public static boolean validarOpcion(char opcion){

        switch (opcion){

            case '1':
            case '2':
            case '3':
            case 'X':
                return true;
            default:
                return false;
        }


    }


}
