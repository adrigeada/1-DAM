package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class actividad_ruleta {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        final String[] COLORES = {"rojo","negro"};
        Integer[] numeros= new Integer[37]; //para poder usar este vector en un Arrays.asList se necesita definir como Integer. Con int no funciona

        for (int i = 0; i< numeros.length ; i++){ //for para crear un vector con numeros entre 0 y 36

            numeros[i]= i;

        }

//        System.out.println(Arrays.toString(numeros));
        final String[] PAR_IMPAR = {"par","impar"};

        System.out.println("Introduce tu numero de apuesta: ");
        int numero_apuesta = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apuesta)){ //¿El vector numeros contiene el numero_apuesta? Para comprobar si el numero escrito es válido (0-36).
            System.out.println("El número no es válido");
            return;

        }

        String color_apuesta = "";
        String par_impar_apuesta = "";

        if (numero_apuesta != 0){ //Si se elige 0, no se hace lo de dentro de este if, porque el 0 no tiene color ni es parimpar

            System.out.println("Introduce el color de tu apuesta (rojo,negro): ");
            color_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(COLORES).contains(color_apuesta)){ //¿El vector COLORES contiene el color_apuesta introducido?
                System.out.println("ERROR. El color no es válido");
                return;
            }

            System.out.println("Introduce apuesta par/impar: ");
            par_impar_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(PAR_IMPAR).contains(par_impar_apuesta)){ //¿El vector PAR_IMPAR contiene la apuesta_par_impar introducida?
                System.out.println("ERROR. La apuesta no es valida (par/impar)");
                return;
            }


        }

        String color_sorteo = COLORES[aleatorio.nextInt(2)]; //va a salir o COLORES [0] o COLORES [1] Colores [0] es rojo colores [1] es negro
        int numero_sorteo = numeros[aleatorio.nextInt(37)]; //Va a salir un numero aleatorio que esté entre las posiciones 0 y 36

        String par_impar_sorteo = "";
        if (numero_sorteo%2 == 0){
            par_impar_sorteo = "par";
        }else {
            par_impar_sorteo = "impar";
        }

        System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

        if (numero_sorteo == numero_apuesta && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta) ){
            System.out.println("HAS GANADO");
        } else if (numero_sorteo == numero_apuesta) {
            System.out.println("Has acertado el número");
        } else if (color_sorteo.equals(color_apuesta)) {
            System.out.println("Has acertado el color");
        } else if (par_impar_sorteo.equals(par_impar_apuesta)) {
            System.out.println("Has acertado " + par_impar_apuesta);
        }else {
            System.out.println("Has perdido :(");
        }


    }
}
