package org.example.Bateria1;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        //EJERCICIO 4. Escribe un programa que cuente cuántas veces aparece una palabra dentro
        // de una frase, sin usar bucles.
        //Se mide la frase, se reemplaza la palabra por nada, se mide la frase sin la palabra.

        String frase = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";

        int longitud = frase.length();
        System.out.println(longitud);
        int longitudpalabra = palabra.length();

        String frase_sin = frase.replace(palabra, "");
        int contar = frase_sin.length(); //longiutd del texto sin palabra
        int resta = longitud - contar; // se resta lo que mide la frase menos lo que mide la frase sin la palabra
        int resultado = resta / longitudpalabra; // el resultado tiene que ser dividible por la longitud de la palabra.
        // si has quitado 3 veces una palabra de 5 caracteres, la resta va a dar 15
        System.out.println(resultado);






    }
}
