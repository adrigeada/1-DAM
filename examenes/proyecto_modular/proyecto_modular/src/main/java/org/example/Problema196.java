package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema196 {
    static Scanner teclado = new Scanner(System.in);

    /**
     *En el método main se va a decidir cuantas veces se va a hacer el método principal. Se controla con un try-catch la entrada de valores diferentes a un int
     * @author Adrián Geada
     */
    static void main() {
        System.out.println("¿Cuantas tablas de sudoku quieres crear?");
        int casos = 0;

        do {
            try {
                casos = teclado.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Hay que poner números");
                teclado.nextLine();
            }
        }while (true);

        teclado.nextLine();

        for (int i = 0; i < casos; i++) {
            principal();
        }

    }

    /**
     * Este método va a recibir los datos de los otros métodos. Va a recibir la matriz del método rellenarTabla, y la va a imprimir. Luego va a pasarle esta tabla a los métodos checkCantidad y checkSimetria. Según sean true o false imprimirá SI o NO
     * @author Adrián Geada
     */
    public static void principal(){

        String tabla[][] = rellenarTabla();

        for (String fila[] : tabla ){
            System.out.println(Arrays.toString(fila));
        }

        if (!checkCantidad(tabla)){
            System.out.println("NO");

        }else if (checkSimetria(tabla)){
            System.out.println("SI");

        }else {
            System.out.println("NO");
        }

    }

    /**
     * Este método va a rellenar una matriz 9x9 por teclado que representa un sudoku. Se van a crear vectores con lo introducido y se van a meter en la matriz. Se controla que los vectores introducidos sean de la misma longitud que la matriz, y que los caracteres introducidos sean números del 1 al 9 o guiones
     * @return tabla - Devuelve un matriz String rellena
     * @author Adrián Geada
     */
    public static String[][] rellenarTabla(){

        String[][] tabla = new String[9][9];

        fuera:
        for (int i = 0; i < tabla.length; i++) {

            System.out.println("Inserta la línea " +(i+1));
            String[] linea = teclado.next().split("");
            if (linea.length == tabla.length){

                for (int j = 0; j < tabla[i].length; j++) {

                    if (linea[j].matches("[1-9-]")){
                        tabla[i][j] = linea[j];
                    }else {
                        System.out.println("El sudoku se deber rellenar con números del 1 al 9 y guiones");
                        i--;
                        continue fuera;
                    }

                }

            }else {
                System.out.println("La línea del sudoku tiene que tener 9 espacios");
                i--;
            }

        }
        return tabla;
    }

    /**
     * Este método va a recibir la tabla creada en el método anterior. La va a recorrer, cuando un hueco sea diferente a un - (un número), el contador se suma. Esto va a controlar que el sudoku tenga menos de 32 números introducidos.
     * @param tabla rellena por teclado
     * @return true si el sudoku tiene menos de 32 números y el programa continua. False si más de 32, el programa imprime NO y se acaba.
     * @author Adrián Geada
     */

    public static boolean checkCantidad(String[][]tabla){

        int contadorNum = 0;
        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[i].length; j++) {
                if (!tabla[i][j].equals("-")){ //Se recorre la matriz, si en los huecos hay algo diferente a -, contador++
                    contadorNum++;
                }

            }

        }

        if (contadorNum < 32){
            return true;
        }else{
            System.out.println("Este sudoku tiene más de 32 huecos rellenos. Mal sudoku :(");
            return false;
        }

    }

    /**
     * Este método se va a recorrer la matriz de izquierda a derecha de arriba a abajo y de derecha a izquierda de abajo a arriba a la vez. Si el hueco tiene un - los booleanos son true sino false. Luego se comprueba que los dos booleanos sean iguales. Si son iguales se sigue recorriendo la matriz, sino el for para y se devuelve false. Si se ha recorrido la matriz entera y los booleanos han sido iguales en todas las vueltas se devuelve true.
     * @param tabla rellena por teclado
     * @return true si la tabla es simétrica. False si no lo es.
     * @author Adrián Geada
     */
    public static boolean checkSimetria(String[][] tabla){
        boolean arriba = false;
        boolean abajo = false;
        boolean simetria = true;

        fuera:
        for (int i = 0; i < tabla.length / 2; i++) {


            for (int j = 0; j < tabla[i].length; j++) {


                if (tabla[i][j].equals("-")){
                    arriba= true;
                }else {
                    arriba=false;
                }
                if (tabla[8-i][8-j].equals("-")){
                    abajo = true;
                }else {
                    abajo=false;
                }

                if (arriba!= abajo){
                    simetria = false;
                    break fuera;
                }

            }
        }

        return simetria;
    }



}
