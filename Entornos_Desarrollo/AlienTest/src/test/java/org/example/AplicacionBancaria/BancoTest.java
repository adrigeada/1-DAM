package org.example.AplicacionBancaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    static HashMap<String,Double> mapaBanco;

    @BeforeEach
    void empezar(){
        mapaBanco = Banco.getMapaBanco();
        mapaBanco.put("prueba",100.0);
    }

    @Test
    void depositar() {

        double montoDepositado = 50;
        double montoFinal = mapaBanco.get("prueba")+montoDepositado;

        Banco.depositar("prueba",montoDepositado);

        double montoActualizado = Banco.getMapaBanco().get("prueba");

        assertEquals(montoActualizado,montoFinal);

    }

    @Test
    void retirar() {

        double montoRetirado = 50;
        double montoFinal = mapaBanco.get("prueba")-montoRetirado;

        Banco.retirar("prueba",50);

        double montoActualizado = Banco.getMapaBanco().get("prueba");

        assertEquals(montoFinal,montoActualizado);
    }

    @Test
    void consultarSaldo() {
        double importeActual = 100.0;

        assertEquals(importeActual,Banco.consultarSaldo("prueba"));

    }
}