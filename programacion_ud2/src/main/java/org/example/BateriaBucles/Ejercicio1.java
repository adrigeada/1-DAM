package org.example.BateriaBucles;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
//Valida la entrada de un usuario que escribe una contraseña hasta que sea correcta.

        Scanner teclado = new Scanner(System.in);

        String buena = "admin1234";
        do {
            System.out.println("Introduce la contraseña");
            String contrasenya = teclado.next();

            if (contrasenya.equals(buena)){
            break;
            }
            System.out.println("mal");
        }while (true); //esto es un bucle infinito si no se pone el break

        System.out.println("bien");



    }
}
