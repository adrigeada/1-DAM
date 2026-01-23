package org.example.BateriaRandom;

import java.util.Random;

public class apuntesrandom {

        static void main() {

            Random aleatorio = new Random();

            int num = aleatorio.nextInt(10); //genera numeros aleatorios en el rango que tiene. Del 0 al 9.

            int num1 = aleatorio.nextInt(10)+1; // del 0 al 9, pero se le suma 1

            int num2 = aleatorio.nextInt(5)+5; //del 0 al 4, pero se le suma 5. 0 es 5, 1 es 6...,
            System.out.println(num2);

            int num3 = aleatorio.nextInt(5,10);  //del 5 al 9

        }

}
