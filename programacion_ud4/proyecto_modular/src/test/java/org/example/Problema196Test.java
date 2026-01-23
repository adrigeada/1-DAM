package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problema196Test {

    /**
     * Este método comprueba si la tabla introducida tiene mas o menos de 32 números. Menos de 32 números true, más false
     * En el primer test se le pasa una matriz llena de guiones, por lo que el test tiene que devolver true
     * En el segundo test se le pasa una matriz llena de 1, por lo que el test tiene que devolver flase
     * @author Adrián Geada
     */
    @Test
    void checkCantidad() {

        String[][] tabla = new String[9][9];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                tabla[i][j] = "-";
            }
        }

        assertTrue(Problema196.checkCantidad(tabla));

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                tabla[i][j] = "1";
            }
        }


        assertFalse(Problema196.checkCantidad(tabla));
    }

    /**
     * Este método comprueba la simetría de la tabla introducida. Si es simétrica, devuelve true, si no lo es devuelve false.
     * En el primer test se le da una tabla llena de 1, por lo que debe devolver true.
     * En el segundo test se le da una tabla lena de 1 menos en una posición, por lo que tiene que devolver false.
     * @author Adrián Geada
     */

    @Test
    void checkSimetria() {

        String[][] tabla = {{"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"},
                            {"1","1","1","1","1","1","1","1","1"}};

        assertTrue(Problema196.checkSimetria(tabla));

        String[][] tablaMal = {{"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","1"},
                                {"1","1","1","1","1","1","1","1","-"}};

        assertFalse(Problema196.checkSimetria(tablaMal));

    }
}