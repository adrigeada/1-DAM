package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboTest {

    @Test
    void cubo() {
        assertAll( //Si el primero falla el segundo no se hace, a no ser que los metas en un assertAll.

                () -> assertEquals(8 ,Ejercicio1.cubo(2) ), //Si le doy un dos me deberia de dar un 8
                () -> assertEquals(27 ,Ejercicio1.cubo(3)),
                () -> assertFalse(Ejercicio1.par(3)),
                () -> assertTrue(Ejercicio1.par(4))

        );


    }
}