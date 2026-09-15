package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    /**
     * Creo dos Aliens para comprobar que los constructores funcionan bien.
     * Luego uso los getters para probar que los objetos se han creado bien.
     */
    @Test
    void constructorTest(){
        Alien a1 = new Alien("Zorg","MARS01");
        Alien a2 = new Alien();


        assertAll(() -> assertEquals("Zorg",a1.getName()),
                () -> assertEquals("MARS01",a1.getPlanetId()),
                () -> assertEquals("",a2.getName())
        );

    }

    /**
     * Uso el método set para cambiar el nombre y el id del Alien.
     * Luego uso los getter para comprobar que han funcionado bien.
     */
    @Test
    void setterTest(){
        Alien a1 = new Alien("Zorg","MARS01");

        a1.setName("Marciano");
        a1.setPlanetId("Marte");

        assertAll(() -> assertEquals("Marciano",a1.getName()),
                () -> assertEquals("Marte",a1.getPlanetId())
        );
    }

    /**
     * Creo dos Aliens para probar que el método toString funciona bien.
     */
    @Test
    void TestToString(){
        Alien a2 = new Alien("Xenomorph","LV426");
        Alien a1 = new Alien();

        assertAll(() -> assertEquals("Xenomorph LV426",a2.toString()),
                () -> assertEquals(" ",a1.toString())

        );

    }

    /**
     * Prueba de que el método equals funciona bien.
     * Si dos Aliens tienen el mismo planetaId el método devuelve true.
     * Pruebo este método con Aliens con el mismo planetaId, y con diferente.
     */
    @Test
    void testEquals() {
        Alien a1 = new Alien("Zorg","MARS01");
        Alien a2 = new Alien("Xenomorph","MARS01");
        Alien a3 = new Alien("Zorg","LV426");

        assertAll(() -> assertTrue(a1.equals(a2)),
                () -> assertFalse(a1.equals(a3))

        );

    }
}