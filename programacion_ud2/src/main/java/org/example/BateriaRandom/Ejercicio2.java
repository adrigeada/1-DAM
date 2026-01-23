package org.example.BateriaRandom;

import java.util.Random;

public class Ejercicio2 {
    static void main() {
        Random aleatorio = new Random();


        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";

        for (int i =0; i<12 ; i++){

            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1)); //tiene que ser -1 porque si coge el char de la posicion 62, no hay nada.
        }
        System.out.println(contrasenya);
    }


}
