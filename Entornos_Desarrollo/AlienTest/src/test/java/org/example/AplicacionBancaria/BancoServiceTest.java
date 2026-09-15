package org.example.AplicacionBancaria;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BancoServiceTest {

    @Mock
    private RepositorioBanco repositorioBanco;

    @InjectMocks
    private BancoService bancoService;


    @Test
    void obtenerSaldo() {
        when(repositorioBanco.obtenerSaldo("prueba")).thenReturn(100.0);

        double monto = bancoService.consultarSaldo("prueba");



    }

    @Test
    void actualizarSaldo() {



    }
}