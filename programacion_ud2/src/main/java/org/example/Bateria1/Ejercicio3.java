package org.example.Bateria1;

public class Ejercicio3 {
    static void main() {
        //EJERCICIO 3. Programa que quite a una variable numérica N sus m últimas cifras.
        //Por ejemplo, si N = 123456 y m = 2, el nuevo valor de N será 1234.

        int N = 12345896;
        int m = 5;

        String numero_a_string = Integer.toString(N); //paso el numero N a String para poder calcular su longitud
        int logitudN = numero_a_string.length();        //miro cual es la longitud del String que acabo de crear
        System.out.println("-Esta es la longitud del número N: "+logitudN);

        int posicion = logitudN - m;      //al restar la longitud del numero N menos m tenemos la cantidad de
        // caracteres hasta la que queremos incluir. Si queremos quitar 2 caracteres por la derecha vamos a
        // incluir hasta la posicion 4. Si queremos quitar 5 caracteres por la derecha, vamos a incluir hasta la posicion 1

        System.out.println("-Esta es hasta que posicion vamos a incluir: "+posicion);

        String trozo = numero_a_string.substring(0,posicion);
        System.out.println("-El resultado es: "+trozo+". Hemos quitado al numero "+N+", "+m+" cifras por la derecha");





    }
}
