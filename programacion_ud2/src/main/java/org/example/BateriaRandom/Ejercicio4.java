package org.example.BateriaRandom;

import java.util.Random;

public class Ejercicio4 {
    static void main() {
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";
        String  contrasenya2 = "";
        String contrasenya3 = "";
        String contrasenyafinal = "";

        int cantidad = aleatorio.nextInt(5)+8; //5 numeros empezando por el 8
        System.out.println(cantidad);

        String mayusculas = caracteres.substring(0,25);
        String minusculas = caracteres.substring(26,51);
        String numeros = caracteres.substring(52);


//        contrasenya += mayusculas.charAt(aleatorio.nextInt(24)); //tiene que ser -1 porque si coge el char de la posicion 62, no hay nada.
//        contrasenya2 += minusculas.charAt(aleatorio.nextInt(24));
//        contrasenya3 += numeros.charAt(aleatorio.nextInt(9));

        for (int i =0; i<cantidad-3 ; i++){ //le resto 3 a la cantidad porque los tres primeros

            if (i==0){
                contrasenya += mayusculas.charAt(aleatorio.nextInt(24)); //tiene que ser -1 porque si coge el char de la posicion 62, no hay nada.
                contrasenya2 += minusculas.charAt(aleatorio.nextInt(24));
                contrasenya3 += numeros.charAt(aleatorio.nextInt(9));
            }
            contrasenyafinal += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));

        }
        System.out.println(contrasenya);
        System.out.println(contrasenya2);
        System.out.println(contrasenya3);
        System.out.println(contrasenyafinal);
        System.out.println(contrasenya+""+contrasenya2+""+contrasenya3+""+contrasenyafinal);
    }
}

