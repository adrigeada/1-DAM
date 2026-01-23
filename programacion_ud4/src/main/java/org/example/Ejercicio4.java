package org.example;

import java.util.Scanner;

public class Ejercicio4 {
     static Scanner teclado = new Scanner(System.in);

    static void main() {

        System.out.println("Bienvenido al bar de Javier");

            double[] dia = rellenarVector();

            for (int j = 0; j < dia.length; j++) {

                System.out.println(dia[j]+ "€ ");
            }

        System.out.println("El día con mas ventas es: "+ masVentas(dia));
        System.out.println("El día con menos ventas es: " +menosVentas(dia));
        System.out.println("La media de toda la semana es: "+ mediaSemanal(dia)+ "€");
        System.out.println("La recaudacion del domingo es: "+recaudacionDomingo(dia)+"€");
        if (recaudacionDomingo(dia) > mediaSemanal(dia)){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }



    }

    /**
     * @author
     * @version
     * Método para introducir ganancias diarias de un bar
     * @return devuelve un vector con las ganancias de la semana
     */
    public static double[] rellenarVector(){


        double[] dia = new double[6];
        do {
            System.out.println("Escribe los valores de la semana");
            String[] semana = teclado.nextLine().split(" ");

            dia = new double[semana.length];
            if (semana.length == 6){

                for (int i = 0; i < semana.length; i++) {

                    dia[i] =  Double.parseDouble(semana[i])  ;
                }

                break;

            }else {
                System.out.println("Introduce 6 dias");
            }
        }while (true);


     return dia;
    }

    /**
     * Metodo que calcula que día se han tenido mas ventas
     * @param dia recibe el vector con las ventas en la semana
     * @return el día que más ventas ha tenido en la semana de martes a domingo
     */
    public static String masVentas (double[] dia){

        double[] copia = dia.clone();
        String[] dias_semana = {"MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
        double aux = 0;
        String aux1 = "";

        for (int i = 0; i < copia.length; i++) {

            if (copia[i] > aux){

                aux = copia[i];
                aux1 = dias_semana[i];
            }

        }
//        System.out.println(aux + " Es el valor de mas ventas"+"en el día "+aux1);


        return aux1;
    }

    public static String menosVentas (double[] dia){

        double aux_menor = 50000;
        int aux_posicion = 0;
        for (int i = 0; i < dia.length; i++) {

            if (dia[i] < aux_menor){

                aux_menor = dia[i];
                aux_posicion = i;
            }
        }

        switch (aux_posicion){

            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";

        }


        return "a";
    }

    public static double mediaSemanal(double[] dia){

        double[] media = dia.clone();
        double resultadoMedia = 0;

        for (int i = 0; i < media.length; i++) {

            resultadoMedia += media[i];

        }
        resultadoMedia = resultadoMedia/media.length;

        return resultadoMedia;
    }

    public static double recaudacionDomingo(double[] dia){

        double domingo = 0;

        domingo = dia[dia.length-1];


        return domingo;

    }



}
