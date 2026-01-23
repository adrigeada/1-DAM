package org.example.Bateria_vectores;

import java.util.Arrays;
import java.util.Scanner;

public class vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int[] vector = {1,3,4,6,10};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        vector[2]=8; //cambiar el valor de la posicion 2
        vector[4]=5;

        System.out.println(Arrays.toString(vector));


        String[] vector2 = new String[8]; //el 8 es el tamaño del vector. Si no pones nada, en int saldran 0 y con String da nulls. Con booleanos da falses
        System.out.println(Arrays.toString(vector2)); //las posiciones empiezan desde 0, en este caso del 0 al 7


        int[]vector3 = {3,0,9,5,8};

        vector = vector3.clone(); //Mantienen cada uno su direccion de memoria propia
        System.out.println(vector);// si haces print asi sale la direccion  de memoria.
        System.out.println(vector3);
        vector=vector3; //Si los igualas así, vector copia la direccion de memoria de vector3.
        System.out.println(vector);


        for (int i = 0 ; i< vector3.length; i++){
            System.out.print(vector3[i]);
        }
        System.out.println("");

        for (int j= vector3.length-1; j>=0 ; j--){

            System.out.print(vector3[j]);

        }

        //Rellenar un vector por teclado

        int[] vector4 = new int[4];
        for (int i = 0; i<vector4.length; i++){

            vector4[i] = teclado.nextInt();

        }
        System.out.println(Arrays.toString(vector4));
    }
}
