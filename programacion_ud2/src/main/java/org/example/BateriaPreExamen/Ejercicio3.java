package org.example.BateriaPreExamen;

public class Ejercicio3 {
    static void main() {
        //Ejercicio 3. Una persona adquirió un producto en MediaMarkt que financió a 20 meses.
        // El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente.

    int meses = 6;
    int pago_inicial = 10;
    int resultado = 0;

    for (int i = 1; i<=meses; i++){
        resultado += pago_inicial;
        System.out.println(pago_inicial);
        pago_inicial *= 2;

    }
        System.out.println(resultado);




    }
}
