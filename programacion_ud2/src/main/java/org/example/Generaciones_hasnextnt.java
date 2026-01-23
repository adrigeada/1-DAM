package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Generaciones_hasnextnt {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        
        boolean seguir = true;
        final int ANYO_MINIMO = 1900;
        int modo = 0;

        LocalDateTime fecha = LocalDateTime.now(); //Sacar el año actual
        int anyo_actual = fecha.getYear();

        int anyo_nacimiento_int = 0;

        System.out.println("Escribe el modo de calculo");
        System.out.println("1 - Año de nacimiento");
        System.out.println("2 - edad");
        System.out.println("------------------");

        if (teclado.hasNextInt()){
            modo = teclado.nextInt();   //si lo introducido es un numero entero sale del if
            
        }else {     //sino, salta el else
            System.out.println("No has introducido un valor permitido (1 o 2)");
            seguir = false; // se puede sustituir esto por un return
        }
        
        if (seguir){ //if seguir = true
            
            if (modo == 1){

                System.out.println("Introduce tu año de nacimiento");
                String anyo_nacimiento = teclado.next();


                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento); //pasamos el año de nacimiento a int. Lo hemos hecho string porque lo pide el ejercicio pero podria ser un int desde el principio
                }catch (NumberFormatException e){
                    System.out.println("El formato no es numérico");
                    return;
                }

                
            } else if (modo == 2) {
                System.out.println("Introduce tu edad");

                int edad = 0;
                if (teclado.hasNextInt()){
                    edad = teclado.nextInt();
                }else {
                    System.out.println("La edad no tiene formato numérico");
                    return;
                }

                if (edad >= 0 ){
                    anyo_nacimiento_int = anyo_actual - edad;


                }else {
                    System.out.println("edad negativa");
                    return;
                }
                
            }else{
                System.out.println("El modo introducido no es correcto"); //si el modo introducido es diferente a 1 o 2
                return;
            }



            if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual){

                if (anyo_nacimiento_int <= 1927){
                    System.out.println("Generación sin bautizar");
                } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944){
                    System.out.println("Generación silent");
                } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                    System.out.println("Baby Boomers");
                } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                    System.out.println("Generación X");
                } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                    System.out.println("Millenial");
                } else {
                    System.out.println("Generación Z");
                }


            }
                

        }




    }
}
