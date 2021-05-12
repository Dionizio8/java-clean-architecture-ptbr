package br.com.alura.escola.shared.dominio;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("35518534348"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("aaa.bbb.aa-aa"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("395.189.838-843"));
    }

}