package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Generaciones_switchcase {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        int nacimiento_int = 0;
        int edad = 0;
        final int ANYO_MINIMO = 1900;
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();


        System.out.println("Escribe el modo de cálculo");
        System.out.println("1 - Año de nacimiento");
        System.out.println("2 - Edad");
        System.out.println("---------------");

        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else {
            System.out.println("El dato introducido tiene que ser un número");
            return;
        }

        switch (modo){

            case 1:
                System.out.println("Escribe tu año de nacimiento");

                String anyo_nacimiento = teclado.next();
                try{
                    nacimiento_int = Integer.parseInt(anyo_nacimiento);
                }catch (NumberFormatException e){
                    System.out.println("El año de nacimiento tienen que ser números");
                    return;
                }
                break;



            case 2:
                System.out.println("Escribe tu edad");

                try{
                    edad = teclado.nextInt();
                }catch (Exception e){
                    System.out.println("Tu edad tiene que estar en formato numérico");
                    return;
                }
                if (edad <= 0){
                    System.out.println("Tu edad no puede ser 0 o negativa");
                    return;
                }else {
                    nacimiento_int = anyo_actual - edad;
                }

                break;

            default:
                System.out.println("Tines que escribir 1 o 2");

                return;
        }

        if (nacimiento_int >= ANYO_MINIMO && nacimiento_int <= anyo_actual){

            if (nacimiento_int <= 1927){
                System.out.println("Generación sin bautizar");
            } else if (nacimiento_int >= 1928 && nacimiento_int <= 1944){
                System.out.println("Generación silent");
            } else if (nacimiento_int >= 1945 && nacimiento_int <= 1964) {
                System.out.println("Baby Boomers");
            } else if (nacimiento_int >= 1965 && nacimiento_int <= 1981) {
                System.out.println("Generación X");
            } else if (nacimiento_int >= 1982 && nacimiento_int <= 1994) {
                System.out.println("Millenial");
            } else {
                System.out.println("Generación Z");
            }

        }else {
            System.out.println("Fuera de los parámetros");
        }




    }
}
