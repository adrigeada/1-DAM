package org.example;

import java.util.Scanner;

public class ProyectoJuez {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
        }

    }

    public static void casoDePrueba() {

        String tabla[][] = rellenarTabla();

        if (!checkCantidad(tabla)){
            System.out.println("NO");

        }else if (checkSimetria(tabla)){
            System.out.println("SI");

        }else {
            System.out.println("NO");
        }

    }


    public static String[][] rellenarTabla(){

        String[][] tabla = new String[9][9];

    teclado.nextLine();
        for (int i = 0; i < tabla.length; i++) {

            String[] linea = teclado.next().split("");

                for (int j = 0; j < tabla[i].length; j++) {

                        tabla[i][j] = linea[j];
                }

        }

        return tabla;
    }



    public static boolean checkCantidad(String[][]tabla){

        int contadorNum = 0;
        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[i].length; j++) {
                if (!tabla[i][j].equals("-")){
                    contadorNum++;
                }

            }

        }
        if (contadorNum <= 32){
            return true;
        }else{
            return false;
        }

    }

    public static boolean checkSimetria(String[][] tabla){

        boolean simetria = true;

        fuera:
        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[i].length; j++) {

               boolean arriba = tabla[i][j].equals("-");
               boolean abajo = tabla [8-i][8-j].equals("-");

               if (arriba!= abajo){
                   return false;
               }

            }
        }

        return true;
    }


}
