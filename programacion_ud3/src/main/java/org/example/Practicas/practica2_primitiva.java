package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica2_primitiva {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        String apuesta = "";
        boolean formato = true;
        boolean repetir = true;
        boolean repetido = true;

        String[] vector_apuesta =new String[7];
        Integer[] vector_apuesta_int = new Integer[7];
        Integer[] sorteo = new Integer[6];


        do {

            do {

                System.out.println("Introduce los datos de tu boleto:");
                apuesta= teclado.nextLine();

                formato = apuesta.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

                if (!formato){
                    System.out.println("El formato está mal, vuelve a introducir tus numeros.");
                }

            }while (!formato); //Controlar que el formato está bien


            //Pasar los datos introducidos a un vector con el split
            vector_apuesta = apuesta.split("[-/]");

//        System.out.println(Arrays.toString(vector_apuesta));

            //Pasar el vector string a int para poder comprobar que los numeros estan entre el 1 y el 49
            for (int i = 0; i< vector_apuesta.length; i++){

                vector_apuesta_int[i] = Integer.parseInt(vector_apuesta[i]);
                if (vector_apuesta_int[i] >49 || vector_apuesta_int[i] < 1){
                    System.out.println("Los números tienen que estar entre el 1 y 49. Vuelve a introducir tu apuesta");
                    repetir= false;
                }//Controlar numeros entre el 1 y el 49

                if (i== vector_apuesta.length-1 && vector_apuesta_int[i]<0){
                    System.out.println("El reintegro tiene que ser un número entre el 0 y 9");
                    repetir=false;
                }//Controlar que el reintegro está entre el 0 y 9

            }



        }while (!repetir);

        System.out.println(Arrays.toString(vector_apuesta_int));

        //Sacamos 6 números aleatorios y hay que probar que los numeros no estén repetidos. Si encuentra un número repetido, lo cambia por otro aleatorio y vuelve a comprobar que no hayan numeros aleatorios.
        for (int i = 0 ; i< sorteo.length;i++){
            sorteo[i] = aleatorio.nextInt(49)+1;
        }

//        System.out.println(Arrays.toString(sorteo));

        while (repetido){
            repetido=false;

            Arrays.sort(sorteo);

            for (int i = 0; i< sorteo.length; i++){

                if (i!= sorteo.length-1 && sorteo[i] == sorteo[i+1]){
                    sorteo[i] = aleatorio.nextInt(49)+1;
                    repetido=true;

                }

            }
        }

        System.out.println("");
        System.out.println("SORTEO");
        System.out.print("Ha salido: ");
        System.out.println(Arrays.toString(sorteo));


        int reintegro = aleatorio.nextInt(10);
        int complementario = 0;
        boolean contiene_complementario = false;

        //Controlamos que el numero complementario no esté en el vector del sorteo. Si el numero complementario aleatorio está en el vector del sorteo se vuelve a encontrar un nuevo numero complementario aleatorio
        do {
            complementario = aleatorio.nextInt(49)+1;
            contiene_complementario = Arrays.asList(sorteo).contains(complementario);
//            System.out.println(complementario);
//            System.out.println(contiene);

        }while (contiene_complementario);

        System.out.println("Complementario: "+complementario);
        System.out.println("Reintegro: "+reintegro);




    boolean contiene_premio=true;
    int premio_reintegro = 0;
    int premio_sorteo=0;

    //Comprobamos si el reintegro introducido coincide con el reintegro aleatorio
    if (reintegro == vector_apuesta_int[vector_apuesta_int.length-1]){
        premio_reintegro++;
    }

    //En cada vuelta se comprueba el numero de la posicion i de la apuesta. No se comprueba el reintegro porque la length de sorteo es menor a la length de la apuesta. Nunca llega al ultimo numero de la apuesta que es el reintegro.
    //¿La posición i de tu apuesta está en sorteo? Si está, sube el contador premio sorteo, sino, no pasa nada y sigue el for.
        for (int i = 0 ; i< sorteo.length; i++){

        contiene_premio= Arrays.asList(sorteo).contains(vector_apuesta_int[i]);

        if (contiene_premio){
            premio_sorteo++;
        }

    }

    //Comprobar si el número complementario está en nuestra apuesta y ver en que posición está. Si está en la posición 6 no cuenta, porque esa es la posición del reintegro.
        boolean apuesta_contiene_complementario= Arrays.asList(vector_apuesta_int).contains(complementario);
        int posicion = Arrays.binarySearch(vector_apuesta_int, complementario);


    //Prints finales para comprobar la categoría del premio

        System.out.println("");
        System.out.println("RESULTADOS");
        int resultado_final = premio_reintegro+premio_sorteo;

        System.out.println(resultado_final+ " " + (resultado_final == 1 ? "Acierto" : "Aciertos"));

        if (premio_sorteo+premio_reintegro == 7){
            System.out.println("Categoría especial");
        } else if (premio_sorteo == 6) {
            System.out.println("Primera categoría");
        } else if (premio_sorteo == 5 && posicion != 6 && apuesta_contiene_complementario) { //Si aciertas 5 números, el numero complementario está en tu apuesta y no está en la posicion del reintegro.
            System.out.println("Segunda categoría");
        } else if (premio_sorteo == 5) {
            System.out.println("Tercera categoría");
        } else if (premio_sorteo == 4) {
            System.out.println("Cuarta categoría");
        } else if (premio_sorteo == 3) {
            System.out.println("Quinta categoría");
        }else if (premio_reintegro > 0 && premio_sorteo < 3){
            System.out.println("Reintegro");
        }else {
            System.out.println("No premiado");
        }






    }
}
