package org.example.Practicas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica1_samurais {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] equipo = new int[7];
        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];
        String potencias = "";
        String[] vetor_potencias= new String[equipo.length];
        int control_30 = 0;

        //Este for siempre se va a hacer 2 veces para hacer los dos equipos.
        //Dentro del for, hay un do while que se repite hasta que la suma de la potencia de los samurais de 30 exacto.
        //Lo de igualar a 200 es una forma de asegurarme que el do while se repite aunque la suma de numeros no validos sea 30. 25+1+1+1+1+1+0 y 14+15+1 dan 30, pero no son datos validos.
        for (int j = 1; j<=2;j++){

            System.out.println("Equipo "+j);

            do {
                control_30= 0; //cada vez que se reinicia el bucle, el control vuelve a 0.

                System.out.println("Introduce la potencia de los samurais dividido con comas");
                potencias = teclado.next();

                vetor_potencias = potencias.split(",");

                if (vetor_potencias.length==7){

                    for (int i = 0; i< equipo.length; i++){

                        //Ahora pasar cada hueco del string a ints. Para poder sumarlos entre si.
                        equipo[i] = Integer.parseInt(vetor_potencias[i]); //El String de la posicion i se pasa a int.

                        if (equipo[i]>24 || equipo[i]<1){
                            System.out.println("Los numeros deben estar entre 1 y 24, vuelve a empezar.");
                            control_30=200;
                            break;
                        }
                        //Esto lo hago para controlar los numeros mayores de 24 y menores de 1. Lo igualo a 200 para que no salga el mensaje de ERROR, por la suma total mayor de 30 y que se repita el bucle do while

                        control_30 += equipo[i]; //Se suman los int de cada posicion.

                    }
                }else{
                    System.out.println("Tienes que usar 7 samurais");
                    control_30=200;
                }
//                    System.out.println(control_30);


                    //Si no hago lo de igualar a 200, este mensaje saldría siempre que uso números que no estén entre el 1 y 24.
                    if (control_30!=30 && control_30!=200){
                        System.out.println("ERROR. La potencia total no suma 30");
                    }

                    if (j==1){
                        equipo1 = equipo.clone();// Hay que clonarlos para que no sean los tres el mismo. Si solo los igualas, no funciona.
                    }else {
                        equipo2 = equipo.clone();
                    }
                    if (control_30==30){
                        System.out.println("Equipo completado");
                    }

            }while(control_30!=30 || vetor_potencias.length != 7);

        }//Final del for que se hace dos veces para separar los dos equipos.

        System.out.println("¡Empieza la batalla!");

        //Ya estan los dos equipos hechos guardados en un array int de longitud 7 cada uno
        //Ahora se saca un numero aleatorio entre el 0 y el 6, para saber en que posición empieza la batalla.
        //Esta posición será la i del for.

        int posicion_inicial = aleatorio.nextInt(7);
        System.out.println("La batalla comienza con el Samurai: "+ (posicion_inicial+1));
        int contador_equipo1=0;
        int contador_equipo2=0;
        int contador1 = 0;
        int contador2 = 0;

        //ATENCIÓN --> Lo que viene a continuación se me ocurrió en clase y lo comenté con Denis y Eric sin saber si funcionaría. No se si lo habrán hecho asi al final, pero a lo mejor lo tenemos igual por eso.

        //Con la j controlo que siempre da las vueltas necesarias. La i y la k las uso para las posiciones.
        //La i empezará en una posicion aleatoria hasta que llegue a la ultima posicion.
        //Cuando i es mas grande que la longitud, se empieza a usar la k SIEMPRE desde la posicion 0. Y así vuelvo al principio.
        //Cada vez que un samurai pierde, su potencia pasa a 0, y si es empate los dos pasan a ser 0.

        for (int i=posicion_inicial, j=0, k=0 ; j<equipo.length ; j++, i++){

            if (i<equipo.length){

                if (equipo1[i] > equipo2[i]){
                    System.out.println("Samurai "+(i+1)+". Gana equipo 1. "+equipo1[i]+ " vs "+ equipo2[i]);
                    equipo2[i]=0;
                    contador2++;

                }else if (equipo1[i]< equipo2[i]){
                    System.out.println("Samurai "+(i+1)+". Gana equipo 2. "+equipo1[i]+ " vs "+ equipo2[i]);
                    equipo1[i]=0;
                    contador1++;

                }else {
                    System.out.println("Samurai "+(i+1)+ ". Empate. "+equipo1[i]+ " vs "+ equipo2[i] );
                    equipo1[i]=0;
                    equipo2[i]=0;

                }

            }else {
                if (equipo1[k] > equipo2[k]){
                    System.out.println("Samurai "+(k+1)+". Gana equipo 1. "+equipo1[k]+ " vs "+ equipo2[k]);
                    equipo2[k]=0;
                    k++;
                    contador2++;

                }else if (equipo1[k]< equipo2[k]){
                    System.out.println("Samurai "+(k+1)+". Gana equipo 2. "+equipo1[k]+ " vs "+ equipo2[k]);
                    equipo1[k]=0;
                    k++;
                    contador1++;

                }else {
                    System.out.println("Samurai "+(k+1)+ ". Empate. "+equipo1[k]+ " vs "+ equipo2[k] );
                    equipo1[k]=0;
                    equipo2[k]=0;
                    k++;
                }
            }
            if (contador1 == 4 || contador2 ==4){ //Si las bajas de uno de los dos equipos llegan a 4, las batallas paran
                break;
            }

        }

//        System.out.println(Arrays.toString(equipo1));
//        System.out.println(Arrays.toString(equipo2));

        //Como la potencia de los samurais que han perdido ha pasado a ser 0, Cuento cuantos ceros hay en cada equipo para comprobar que equipo ha ganado.
        for (int i = 0; i<equipo.length ; i++){
            if (equipo1[i]==0){
                contador_equipo1++;
            }
            if (equipo2[i]==0){
                contador_equipo2++;
            }
        }

        //Prints finales donde se comparan los dos contadores.

        if (contador_equipo1 > contador_equipo2){
            System.out.println("¡Gana equipo 2! Equipo 1 ha tenido "+contador_equipo1+" bajas");
        }else if (contador_equipo1 < contador_equipo2){
            System.out.println("¡Gana equipo 1! Equipo 2 ha tenido "+contador_equipo2+" bajas");
        }else {
            System.out.println("¡Ha habido empate! Equipo 1 ha tenido "+contador_equipo1+ " bajas. Y el equipo 2 ha tenido "+contador_equipo2+ " bajas. ");
        }



    }
}
//1,3,5,5,7,8,1
//2,3,3,4,5,6,7
// 6,6,6,6,1,1,4
// 3,2,3,4,5,6,7