package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NotadeAmor {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean repetir = true;
        boolean partida = true;
        int nota = 0;
        int profe = 0;

        int[][] mapa = {{3,4,5},{0,1,2}};


        for (int i = 0; i < mapa.length; i++) {
            System.out.println(Arrays.toString(mapa[i]));
        }

        while (repetir){
            repetir= false;
            nota = aleatorio.nextInt(5)+1;
            profe = aleatorio.nextInt(5)+1;
            System.out.println("Nota: "+nota+ " Profe: " +profe);
            if (nota == profe){
                repetir = true;
            }
        }

        int altura_inicial = 1;
        int longitud_inicial = 0;
        int posicion_inicial = mapa[altura_inicial][longitud_inicial];
        int posicion = 0;


        do {

//            System.out.println(posicion_inicial);
            System.out.println("Escribe la dirección que quieres tomar");
            String decision = teclado.next();
            teclado.nextLine();

            //HCER ESTO CON UN SWITCH CASE

            if (decision.equals("E")){
                posicion = mapa[altura_inicial][longitud_inicial+1];
                longitud_inicial++;
            } else if (decision.equals("N")) {
                posicion = mapa[altura_inicial-1][longitud_inicial];
                altura_inicial--;
            } else if (decision.equals("S")) {
                posicion = mapa[altura_inicial+1][longitud_inicial];
                altura_inicial++;
            } else if (decision.equals("O")) {
                posicion = mapa[altura_inicial][longitud_inicial-1];
                longitud_inicial--;
            }
            System.out.println(posicion);

            if (posicion== nota){
                System.out.println("Ha encontrado la nota de amor");
                partida = false;
            } else if (posicion==profe) {
                System.out.println("Te ha pillado el profe");
                partida=false;
            }

        }while(partida);



    }
}
