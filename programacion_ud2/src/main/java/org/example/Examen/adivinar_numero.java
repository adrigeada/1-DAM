package org.example.Examen;

import java.util.Random;
import java.util.Scanner;

public class adivinar_numero {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int intentos = 10;
        int minumero = 0;
        int numerosecreto = aleatorio.nextInt(101);
        System.out.println(numerosecreto);
        System.out.println("He pensado numero ");


        for (int i = 1 ; i<=intentos ; i++){

            System.out.println("Escribe tu número");
            try {
                minumero = teclado.nextInt();
            }catch (Exception e){
                System.out.println("Mal");
                intentos++;
                teclado.nextLine();
                continue;
            }


            if (minumero == numerosecreto){
                System.out.println("Ganaste");
                break;
            }
            if (i == intentos){
                System.out.println("Te has quedado sin intentos");
                break;
            }

            if (minumero > numerosecreto){
                System.out.println("El numero secreto es más pequeño");
                System.out.println("Te quedan "+(intentos-i)+" intentos");
            }else {
                System.out.println("El numero secreto es mayor");
                System.out.println("Te quedan "+(intentos-i)+" intentos");
            }


        }

    }
}
