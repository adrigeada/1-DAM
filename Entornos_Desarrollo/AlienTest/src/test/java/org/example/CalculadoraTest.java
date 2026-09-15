package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void inicioPruebas(){
        calculadora = new Calculadora(12,3);
    }

    @AfterEach
    public void finPruebas(){
        calculadora = null;
    }

    @Test
    void suma() {
        assertEquals(15,calculadora.suma());
    }

    @Test
    void resta() {
        assertEquals(9,calculadora.resta());
    }

    @Test
    void multiplica() {
        assertEquals(36,calculadora.multiplica());
    }

    @Test
    void divide() {
            assertEquals(4,calculadora.divide());
    }

    @Test
    void dividirException(){
        Calculadora dividir0 = new Calculadora(30,0);

        String valorEsperado = "División entre 0";
        String valorDevuelto = "";

        try{
            dividir0.divide();
        }catch (ArithmeticException e){
            valorDevuelto = e.getMessage();
        }

        assertEquals(valorEsperado,valorDevuelto);
    }

    //Tests con parámetros

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testSumaConValueSource(int num){
        Calculadora calc = new Calculadora(num,5);

        int valorEsperado = num+5;
        int valorDevuelto = calc.suma();

        assertEquals(valorEsperado,valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "4,5,9",
            "-1,-2,-3",
            "0,0,0"
    })
    public void testSumaConCsvSource(int a,int b,int valorEsperado){
        Calculadora calc = new Calculadora(a,b);

        int valorDevuelto = calc.suma();

        assertEquals(valorEsperado,valorDevuelto
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testRestaConValueSource(int num){
        Calculadora calc = new Calculadora(num,5);

        int valorEsperado = num-5;
        int valorDevuelto = calc.resta();

        assertEquals(valorEsperado,valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "2,1,1",
            "9,5,4",
            "-1,-2,1",
            "0,0,0"
    })
    public void testRestaConCsvSource(int a,int b,int valorEsperado){
        Calculadora calc = new Calculadora(a,b);

        int valorDevuelto = calc.resta();

        assertEquals(valorEsperado,valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testMultiplicacionConValueSource(int num){
        Calculadora calc = new Calculadora(num,5);

        int valorEsperado = num*5;
        int valorDevuelto = calc.multiplica();

        assertEquals(valorEsperado,valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "2,2,4",
            "4,5,20",
            "-1,-2,2",
            "0,0,0"
    })
    public void testMultiplicacionConCsvSource(int a,int b,int valorEsperado){
        Calculadora calc = new Calculadora(a,b);

        int valorDevuelto = calc.multiplica();

        assertEquals(valorEsperado,valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testDivisionConValueSource(int num){
        Calculadora calc = new Calculadora(num,5);

        int valorEsperado = num/5;
        int valorDevuelto = calc.divide();

        assertEquals(valorEsperado,valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "50,5,10",
            "10,5,2",
            "-2,-2,1",
            "0,2,0"
    })
    public void testDivisionConCsvSource(int a,int b,double valorEsperado){
        Calculadora calc = new Calculadora(a,b);
        int valorDevuelto = calc.divide();

        assertEquals(valorEsperado,valorDevuelto);
    }



}