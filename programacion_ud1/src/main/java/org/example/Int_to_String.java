package org.example;

public class Int_to_String {

    static void main() {

        int numero = 435; //Posiciones de izquierda a derecha. 4 en posición 0, 3 posicion 1, 5 posición 2

        String numero_string = Integer.toString(numero); //pasar numero int a string

        String numero_medio = numero_string.substring(1,2); // elegir la posición del numero que quieres usar, en este caso el 3

        int numero_medio_int = Integer.parseInt(numero_medio); // Coges el numero en esa posición y lo  vuelves int

        System.out.println("Resultado: " + numero_medio_int);


    }
}
