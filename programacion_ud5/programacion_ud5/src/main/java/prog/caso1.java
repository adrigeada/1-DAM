package prog;

import java.util.*;

public class caso1 { // Asume fichero llamado solution.java

    static Scanner in = new Scanner(System.in);

    public static void casoDePrueba() {
        Stack<Character> pilaChar = new Stack<>();
        Stack<String> pilaInt = new Stack<>();
        String cadena = in.nextLine();
        String respuesta = "";

        for (int i = 0; i < cadena.length(); i++) {
           pilaInt.push(String.valueOf(cadena.charAt(i)));
           if (String.valueOf((cadena.charAt(i+1))).matches("\\d")) {
               String cosa = pilaInt.pop();
               cosa+=String.valueOf((cadena.charAt(i+1)));
               pilaInt.push(cosa);

               pilaChar.push(cadena.charAt(i+2));
               i+=2;

            }else {
               pilaChar.push(cadena.charAt(i+1));
               i++;
           }
        }


     while (!pilaInt.isEmpty()){
        int vueltas = Integer.parseInt(pilaInt.pop());

         for (int i = 0; i < vueltas; i++) {
             respuesta+=pilaChar.peek();
         }
         pilaChar.pop();


     }

        Stack<Character> pilaFinal = new Stack<>();

        for (int i = 0; i < respuesta.length(); i++) {
            pilaFinal.push(respuesta.charAt(i));
        }

        String respuestaFinal = "";
        while(!pilaFinal.isEmpty()){
            respuestaFinal+=pilaFinal.pop();
        }

        System.out.println(respuestaFinal);

        

    } // casoDePrueba

    public static void main(String[] args) {

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution