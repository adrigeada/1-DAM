package org.example.Practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioEntorno {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int cantidad= 0;

        System.out.println("¿A cuanta gente quieres saludar?");

        do {
            try {
                cantidad = teclado.nextInt();
                break;

            }catch (InputMismatchException e){
                System.out.println("Tienes que poner números");
                teclado.nextLine();
            }
        }while (true);


        teclado.nextLine();
        System.out.println("Que empiecen las presentaciones!");

        for (int i = 0; i < cantidad; i++) {

            String nombre = teclado.nextLine();
            String[] nombre_vector = nombre.split(" ");
            System.out.println("Hola, "+ nombre_vector[1] + " ");


        }





    }
}
