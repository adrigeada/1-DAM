package org.example.Examen;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        String opcion = "apt";
        int resultadoyo = 0;
        int resultadopc = 0;
        int intentos = 3;

        for (int i = 1; i<=intentos ; i++){

            System.out.println("Ronda"+ i);
            char eleccion = opcion.charAt(aleatorio.nextInt(3));
            System.out.println(eleccion);

            System.out.println("Piedra, papel o tijera");
            char mieleccion = teclado.next().charAt(0);
            System.out.println(mieleccion);


            if (eleccion == mieleccion){
                System.out.println("empate");
                intentos++;
                continue;
            }
            switch (eleccion){

                case 'p':
                    if (mieleccion == 'a'){
                        System.out.println("Ganaste");
                        resultadoyo++;
                    }else if (mieleccion == 't'){
                        System.out.println("Perdiste");
                        resultadopc++;
                    }
                    break;

                case 'a':
                    if (mieleccion == 'p'){
                        System.out.println("Perdiste");
                        resultadopc++;
                    }else if (mieleccion == 't'){
                        System.out.println("Ganaste");
                        resultadoyo++;
                    }
                    break;

                case 't':
                    if (mieleccion == 'a'){
                        System.out.println("Perdiste");
                        resultadopc++;
                    }else if (mieleccion == 'p'){
                        System.out.println("Ganaste");
                        resultadoyo++;
                    }
                    break;

                default:
                    System.out.println("No has elegido bien");
                    break;

            }

            System.out.println(resultadoyo+"-"+resultadopc);

        }

        if (resultadopc > resultadoyo){
            System.out.println("Has perdido");
        }else {
            System.out.println("Has ganado");
        }



    }
}
