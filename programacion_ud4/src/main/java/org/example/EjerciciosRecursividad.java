package org.example;

import java.util.Scanner;

public class EjerciciosRecursividad {
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        imprimir_menu();
        elegir_opcion();
        System.out.println("");
        repetir();

    }

    public static void imprimir_menu(){

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabético");
        System.out.println("7 - Mostrar suma");

    }

    public static void elegir_opcion(){

        char modo = Character.toUpperCase(teclado.next().charAt(0));

        int num = 0;
        String cadena = "";

        switch (modo){

            case '1':
                System.out.println("Escribe el número del que quieres contar las cifras");
                num = teclado.nextInt();
                System.out.println(ej1(num));

                break;
            case '2':
                System.out.println("Escribe el número y el exponente ");
                num = teclado.nextInt();
                int exponente = teclado.nextInt();
                System.out.println(ej2(num,exponente));
                break;

            case '3':
                System.out.println("Pulsa 1 para número al revés o 2 para frase al revés");
                int ej3 = teclado.nextInt();

                switch (ej3){
                    case 1:
                        System.out.println("Escribe el número");
                        num= teclado.nextInt();
                        ej3(num);
                        break;
                    case 2:
                        teclado.nextLine();
                        System.out.println("Escribe la frase");
                        cadena= teclado.nextLine();
                        char[] frase_char = cadena.toCharArray();
                        ej3String(frase_char.length-1, frase_char);
                        break;
                }
                break;

            case '4':
                System.out.println("Escribe el numero para comprobar si es binario o no");
                num = teclado.nextInt();

                if (ej4(num)){
                    System.out.println("Binario");
                }else {
                    System.out.println("No binario");
                }

                break;
            case '5':
                System.out.println("Escribe el numero que quieres pasar a binario");
                num = teclado.nextInt();
                System.out.println(ej5(num));

                break;
            case '6':
                System.out.println("Escribe una palabra para comprobar si está ordenada alfabéticamente");
                cadena= teclado.next();

                if (ej6(0,cadena)){
                    System.out.println("Ordenada");
                }else {
                    System.out.println("Desordenada");
                }
                break;

            case '7':
                System.out.println("Escribe el número hasta el que quieres sumar");
                num = teclado.nextInt();

                System.out.println(ej7(num,num));

                break;

            default:
                System.out.println("Modo elegido no váldio");

        }

    }

    public static void repetir (){
        System.out.println("Elige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");

        char opcion = Character.toUpperCase(teclado.next().charAt(0));

        if (opcion == 'M') {
            main();
        }
    }

    public static int ej1 (int n){

        if (n < 10){
            return 1 ;
        }else {
             return 1+ej1(n/10);

        }


    }

    public static int ej2 (int base,int exponente){

        if (exponente == 1){
            return base;
        }else{

           return base*ej2(base,exponente-1);
        }

    }

    public static void ej3 (int num){

        if (num < 10){
            System.out.println(num);
        }else {
            System.out.print(num % 10);
            ej3(num/10);
        }

    }

    public static void ej3String(int posicion, char[] frase){

        if (posicion >= 0){
            System.out.print(frase[posicion]);
            ej3String(posicion-1,frase);
        }
    }

    public static boolean ej4 (int num){

        if (num >= 10){

            if (num % 10 == 0 || num % 10 == 1){
               return ej4(num/10);
            }else{
                return false;
            }

        } else {
            if (num == 0 || num == 1) {
                return true;
            } else {
                return false;
            }


        }
    }

    public static String ej5 (int num){

        if (num <= 1){
            return Integer.toString(num);
        }else {
            return ej5(num/2)+ num%2; //se concatena el resto

        }

    }

    public static boolean ej6 (int posicion,String palabra){

        if (posicion == palabra.length()-1){
            return true;
        }else {

            if (palabra.charAt(posicion) < palabra.charAt(posicion+1)){
               return ej6(posicion+1,palabra);
            }else {
                return false;
            }

        }

    }

    public static String ej7 (int num, int limite){

        if (num == 1){
            return (num)+ "+";
        }else if (num == limite){
            int suma = sumaej7(num);
            return ej7(num-1,limite)+(num)+ "=" + (suma);
        }else {
            return ej7(num-1,limite)+(num)+ "+";
        }

    }
    public static int sumaej7 (int num){
        if (num==1){
            return num;
        }else {
            return num+sumaej7(num-1);
        }

    }



}
