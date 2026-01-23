package org.example;

import java.util.Scanner;

//Ejercicio 8. Realiza un programa para mostrar un mensaje por pantalla que indique
// si un triángulo es «escaleno», «equilátero» o «isósceles» introduciendo el tamaño
// de sus lados por teclado.
public class Ejercicio_8 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el tamaño de un lado del triangulo: ");
        float base = teclado.nextFloat();
        System.out.println("Escribe el tamaño de un lado del triangulo: ");
        float lado1 = teclado.nextFloat();
        System.out.println("Escribe el tamaño de un lado del triangulo: ");
        float lado2 = teclado.nextFloat();

        if (base == lado1 && base == lado2) {
            System.out.println(" El triangulo es equilatero ");
        } else if (base != lado1 && lado1 == lado2 || lado1 != lado2 && lado2 == base || lado1 != lado2 && lado1 == base) {
            System.out.println("El triangulo es isosceles ");

        }else {
            System.out.println("El triángulo es escaleno ");
        }


    }
}
