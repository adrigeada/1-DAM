package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problema196Test {

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