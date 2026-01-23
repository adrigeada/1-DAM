package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarMatriz {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        String[][] nombres = new String[2][3];

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Escribe una linea de la matriz");
            String[] fila = teclado.next().split(";");
            if (fila.length == nombres[i].length){

                for (int j = 0; j < nombres[i].length; j++) {

                    nombres[i][j] = fila[j];
                }
            }else {
                System.out.println("El tamaño no es el adecuado");
                i--;
            }


        }

        for (String fila[] : nombres){
            System.out.println(Arrays.toString(fila));
        }




    }
}
