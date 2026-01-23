package org.example;

import java.util.Scanner;

// Ejercicio 7. Necesitamos realizar un programa que decida por nosotros
// si tenemos que ir (o no) a comprar.
public class Ejercicio_7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Tenemos tomate (S/N)?");
        char tomate = teclado.next().charAt(0);
        System.out.println("Tenemos aceite (S/N)?");
        char aceite = teclado.next().charAt(0);
        System.out.println("Tenemos jamón (S/N)?");
        char jamon = teclado.next().charAt(0);

        if (tomate== 'N' || aceite == 'N' || jamon == 'N'){
            System.out.println("Tienes que ir a comprar");
        }else{
            System.out.println("No comprar");
        }



    }
}
