package org.example.Practicas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3_Spectrum {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int ancho = 0;
        int alto = 0;
        boolean repetir = false;

        //Se pide el alto y el ancho, que serán la i y la j de la matriz. Se controlan que sean números y que estén entre el 8 y el 48
        do {
            repetir = false;
            System.out.println("Introduce la resolución de tu pantallas (ancho x alto)");
            System.out.println("Ancho");
            try {

                ancho = teclado.nextInt();
                System.out.println("Largo");
                alto = teclado.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Tienes que introducir números enteros");
                repetir=true;
                teclado.nextLine();
            }




            //Validar que los introducidos son divisibles entre 8

            if (ancho % 8 != 0 || alto % 8 != 0){
                System.out.println("Los números introducidos no son válidos");
                repetir = true;
                continue;
            }

            if (ancho <8 || ancho > 48 || alto <8  || alto > 48){
                System.out.println("Los números introducidos no son válidos");
                repetir= true;
            }

        }while (repetir);

        teclado.nextLine();

        //Introducimos línea por línea la matriz y controlamos que cada letra introducida en cada línea esté dentro del rango A-O
        System.out.println("Introduce línea a línea los colores de tu imagen: ");

        String[][] matriz = new String[alto][ancho];


        fuera:
        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Escribe línea " +(i+1));
            String[] linea = teclado.next().split(""); //Se saca un vector String de lo introducido

            if (linea.length == ancho){ //Se controla que el vector que se crea tenga la misma longitud que la matriz

                for (int j = 0; j < matriz[i].length; j++) {
                    if (linea[j].matches("[A-O]")){ //Se controla que cada letra introducida esté en el rango de [A-O]

                        matriz[i][j] = linea[j];

                    }else {
                        System.out.println("Has introducido un valor de pixel incorrecto");
                        i--;
                        continue fuera;
                    }


                }
            }else {
                System.out.println("La línea introducida tiene que tener los mismos carácteres que el ancho");
                i--;
            }

            //Si alguna de las dos condiciones no se cumple, se vuelve al for de fuera y se resta 1 al contador para poder escribirlo otra vez

        }

        //Imprimimos la matriz que hemos creado

        for (String linea[] : matriz){
            for (String columna : linea){
                System.out.print(columna);
            }
            System.out.println();
        }


        //Ahora lo que voy a hacer es sacar matrices 8x8 de la matriz introducida. Si la matriz introducida es 16x8 sacaré 2, si es 16x16 sacaré 4 ...
        //El primer for controla el ancho de la matriz total. Se hará un numero de veces que depende del ancho de la matriz. En la primera vuelta la j empezará en 0, en la segunda empezará en 8, en la tercera 16...
        //El segundo for va a recorrer el alto de la matriz total. Cada vez que la i llega a 7,15,23,31 o 39 la matriz 8x8 habrá sido creada. Entonces se comprueba si las letras de esta nueva matriz 8x8 creada están repetidas
        //Una vez comprobado, esta matriz nueva se resetea y vuelve a estar vacía para poder empezar el ciclo otra vez.


        int contador_filas = 0;
        int contador_col = 0;
        boolean control = false;
        boolean control_col = false;
        String[] columna = new String[8];
        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};

        int j = 0;
        int h = 0;
        String[][] nueva = new String[8][8];
        boolean test = false;



        todo:
        for (int k = 0 ; k < ancho/8 ; k++){//se va a hacer una vez si el ancho es 8, dos si es 16, 3 si es 24...

            for (int i = 0 ; i < matriz.length ; i++ , h++){
                j=8*k;


                if (i == 0 || i==8 || i==16 || i == 24 || i == 32 || i == 40){ //Cada vez que la matriz 8x8 ha sido creada y comprobada, se resetea la matriz.
                    nueva = new String[8][8];
                    h = 0;
                }

                for (int l = 0 ; l<8 ; l++, j++){

                    nueva[h][l] = matriz[i][j];
                }

//                for (String fila[] : nueva){
//                    System.out.println(Arrays.toString(fila));
//                }

                if (i==7 || i==15 || i == 23 || i == 31 || i == 39) {// Cuando se ha creado una matriz completa se activa el test.
                    test = true;
                }

                if (test){ //Hay dos test. Uno para filas y otro para columnas.

                    //Comprobador de filas. Se coje cada fila de la matriz 8x8 creada, y se cuentan cuantas letras diferentes contiene. Cada fila puede tener un máximo
                    //de dos letras diferentes. Por lo que el máximo de letras diferentes que se pueden contar son 16. Dos en cada fila. Si es más de 16 se para todo el proceso
                    //porque ya sabemos que hay mas de dos letras en una fila
                    contador_filas=0;
                    for (int x = 0; x < 8; x++) {

                        for (int y = 0; y < letras.length; y++) {

                            if (Arrays.asList(nueva[x]).contains(letras[y])){ //Se recorre el vector letras en cada fila de la matriz y se cuentan cuantas letras diferentes hay en cada línea
                                contador_filas++;
//                                System.out.println("filas"+contador_filas);
                            }

                            if (contador_filas > 16){
                                control = true;
                                break todo;
                            }
                        }
                    }

                    //Comprobador de columnas. Se comprueba igual que las filas. Pero como no se puede coger una columna de la matriz 8x8 creada, primero hay que crear un vector
                    // por cada columna, que se va a resetear y va a pasar a estar vacío despues de cada vuelta del for de fuera.
                    contador_col= 0;
                    for (int a = 0; a < nueva.length; a++) { //Se resetea el vector. (no hace falta resetearlo)
//                        columna = new String[8];

                        for (int b = 0; b < columna.length; b++) { //Se crea el vector cogiendo las columnas de la matriz

                            columna[b] = nueva[b][a];

                            if (b == columna.length-1){ //Cuando ha llegado a la ultima vuelta se activa este camino.
//                                System.out.println(Arrays.toString(columna));

                                for (int c = 0; c < letras.length; c++) {//Con este for el contador se suma cada vez que una de las letras posibles está en el vector.

                                    if (Arrays.asList(columna).contains(letras[c])){
                                        contador_col++;
//                                        System.out.println("columnas" +contador_col);
                                    }

                                    if (contador_col > 16){
                                        control_col = true;
                                        break todo;
                                    }


                                }


                            }

                        }

                    }



                }
                test=false; //Una vez acabado el test, si no hay ningun contador que haya superado 16, se resetea. Así no se hará el test en todas las vueltas siguientes, solo cuando se requiera.

            }

        }



        //Si uno de los dos contadores ha sido mayor que 16, se ha activado el booleano control y no sería compatible

        if (control || control_col){
            System.out.println("No compatible");
        }else {
            System.out.println("Compatible");
        }










    }
}
