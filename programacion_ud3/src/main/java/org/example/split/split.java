package org.example.split;

import java.util.Arrays;

public class split {
    static void main() {
        String cadena = "Hola,Soy,Una,Cadena";
        String[] subcadenas = cadena.split(","); //te devuelve un vector tipo string, en cada posicion del vector lo que hay antes de los splits, en este caso comas.
        System.out.println(Arrays.toString(subcadenas));

     String numeros = "23,4,56,78,80";
     String[] vector_num = numeros.split(",");
//        System.out.println(Arrays.toString(vector_num)); //los numeros aqui son strings, con el for paso cada uno a int.
        int[] num=new int[vector_num.length];


        for (int i = 0; i< vector_num.length; i++){
            num[i] = Integer.parseInt(vector_num[i]);

        }
        System.out.println(Arrays.toString(num));


    }
}
