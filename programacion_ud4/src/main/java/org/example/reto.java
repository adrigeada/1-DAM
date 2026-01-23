package org.example;

import java.util.Scanner;

public class reto {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        char hueco = ' ';

        System.out.println("Longitud de lado");
        int lado = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Simbolo a usar");
        char simbolo = teclado.nextLine().charAt(0);

        int altura = lado*2-1;
        int longitudmax = lado+(2*(lado-1));

//        System.out.println(hueco+ "" + simbolo);

        //Parte de arriba
        for (int i = 0 ; i < lado ; i++) {

            for (int k = 0; k < lado -1 -i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < lado +2 *i; j++) {

                System.out.print(simbolo);
            }
            System.out.println();

        }

        //Parte de abajo

        for (int i = lado-1; i > 0; i--) {

            for (int j = 0; j < lado -i -1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < lado +2 *i; k++) {
                System.out.print(simbolo);
            }
            System.out.println();
            
        }



    }
}
