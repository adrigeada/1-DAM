package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Actividad_2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = teclado.nextLine();

        System.out.println("¿A que curso vas?");
        String curso = teclado.next();

        //next y nextline sirven las dos para texto.

        System.out.println("Hola " + nombre + " bienvenid@ al curso " + curso);

        System.out.println("Introduce un número:");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número:");
        int num2 = teclado.nextInt();

        // opción 1
        System.out.println("El resultado es " + (num1+num2));

        //opción 2
        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);

    }
}
