package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste3Test {

    @Test
    public void testParMaiorQue10() {
        assertEquals(1, Teste3.verificaNumero(12));
    }

    @Test
    public void testParMenorOuIgual10() {
        assertEquals(2, Teste3.verificaNumero(6));
    }

    @Test
    public void testImparNegativo() {
        assertEquals(3, Teste3.verificaNumero(-3));
    }

    @Test
    public void testImparPositivo() {
        assertEquals(4, Teste3.verificaNumero(7));
    }
}
