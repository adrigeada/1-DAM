package org.example.Bateria_vectores;

public class Ejercicio6 {
    static void main() {
        int[] vector = {1,2,3,3,2,1};
        int longitud = vector.length;
        int contador = 0;

        for (int i = 0;i<longitud/2; i++){
            if (vector[i]== vector[longitud-1-i]){  //if (vector[i] != vector [longitud -1 -i]) sout no es y break
                contador++;
            }
        }

        if (contador >= longitud/2){
            System.out.println("palindromo");
        }else {
            System.out.println("no");
        }
    }
}
