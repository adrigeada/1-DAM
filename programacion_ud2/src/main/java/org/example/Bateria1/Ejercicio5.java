package org.example.Bateria1;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        final int intentos = 10;
        boolean contiene = true;

        System.out.println("Jugador 1, escribe una frase");
        String frase = teclado.nextLine();


        do {
            System.out.println("Jugador 2, escribe una palabra");
            String palabra = teclado.nextLine();

            contiene = frase.contains(palabra);
            contador++;
            System.out.println("Te quedan "+(intentos - contador)+ " intentos");
        }while (!contiene && contador < intentos);

        if (contador < intentos){
            System.out.println("ganaste");
        }else {
            System.out.println("perdiste");
        }



    }
}
