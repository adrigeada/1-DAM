package org.example;

import java.util.Scanner;

public class ProyectoJuez {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = teclado.nextInt();
        System.out.println(" ");
        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
            System.out.println(" ");
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
        if (contadorNum < 32){
            return true;
        }else{
            return false;
        }

    }

    public static boolean checkSimetria(String[][] tabla){
        boolean arriba = false;
        boolean abajo = false;
        boolean simetria = true;

        fuera:
        for (int i = 0; i < tabla.length / 2; i++) {

            for (int j = 0; j < tabla[i].length; j++) {

                if (tabla[i][j].equals("-")){
                    arriba= true;
                }else {
                    arriba=false;
                }
                if (tabla[8-i][8-j].equals("-")){
                    abajo = true;
                }else {
                    abajo=false;
                }

                if (arriba!= abajo){
                    simetria = false;
                    break fuera;
                }

            }
        }

        return simetria;
    }


}
