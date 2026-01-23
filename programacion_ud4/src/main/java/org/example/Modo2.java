package org.example;

import java.util.Scanner;

public class Modo2 {

    static Scanner teclado;

    public static void main(String[] args) {

         teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int x = teclado.nextInt();
        teclado.nextLine();

        if (x==0)
        return false;
        else {

            int contador = 0;
            int[] vector = new int[x];

            for (int i = 0; i < vector.length; i++) {
                vector[i]= teclado.nextInt();
            }
            if (vector[0]>0){
                contador++;
            }
            for (int i = 1; i < vector.length; i++) {


                if (vector[i] > 0 && vector[i-1] > 0)contador++;
                if (vector[i] == 0 && vector[i-1] > 0)contador++;
                if (vector[i] < 0 && vector[i-1] > 0)contador++;


            }
            System.out.println(contador);

            return true;
        }

    }



}
