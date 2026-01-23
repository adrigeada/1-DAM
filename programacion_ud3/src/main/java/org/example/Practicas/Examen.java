package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int longitud_vector = aleatorio.nextInt(21)+20;

        Integer[] vector = new Integer[longitud_vector];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(90)+1;

        }
boolean repetir = true;


        while (repetir){
            repetir=false;
            Arrays.sort(vector);
//            System.out.println(Arrays.toString(vector));

            for (int i = 0; i < vector.length; i++) {
                if (i != vector.length-1 && vector[i] == vector[i+1]) {
                    vector[i] = aleatorio.nextInt(90+1);
                    repetir = true;

                }
            }
        }

        System.out.println(Arrays.toString(vector));

        int[][] matriz = new int[3][3];
        String[] linea = new String[3];
        String linea_string = "";


        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Escribe la línea "+ (i+1));
            linea_string= teclado.next();

            if (linea_string.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")){ //Si el formato coincide, se transforma en vector, sino se acaba el programa
                linea= linea_string.split("-");

            }else {
                return;
            }

                for (int j = 0; j < matriz[i].length; j++) {

                    matriz[i][j] = Integer.parseInt(linea[j]);

                }

                for (int j = 0; j < matriz.length; j++) {
                    System.out.println(Arrays.toString(matriz[j]));

                }


        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]+" ");

            }
            System.out.println();
        }

        int contador = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {

                if (Arrays.asList(vector).contains(matriz[i][j])) {
                    contador++;
                }
                System.out.println(contador);

            }
        }

        if (contador == 9){
            System.out.println("BINGO");
        }else {

            int contador_linea= 0;
            for (int i = 0; i < matriz.length; i++) {
//                System.out.println("Linea "+ (i+1));
                contador_linea=0;
                for (int j = 0; j < matriz[i].length; j++) {

                    if (Arrays.asList(vector).contains(matriz[i][j])) {
                        contador_linea++;
                    }
                    if (j==2){
                        System.out.println(contador_linea);

                        if (contador_linea == 3){
                            System.out.println("Premio linea " +(i+1));
                        }else {
                            System.out.println("No hay premio para la línea "+(i+1));
                        }

                    }







                }
            }




        }













    }
}
