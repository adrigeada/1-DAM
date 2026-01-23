package org.example;

import java.util.Scanner;

public class dowhile_con_boolean_string {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int longitud= 0;
        String fechanacimiento = "";
        boolean control = true;


        do {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            fechanacimiento = teclado.nextLine();
            longitud = fechanacimiento.length();
            if (longitud != 10) {

                System.out.println("La fecha introducida tiene que tener 10 carácteres contando las barras");

            }else{
                System.out.println("ola");
                control = false;
            }

        }while (control == true);
        System.out.println("fuera");



    }
}