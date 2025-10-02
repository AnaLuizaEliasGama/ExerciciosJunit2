package org.example;

public class Teste3 {
    public static int verificaNumero(int n) {
        if (n % 2 == 0) { // número par
            if (n > 10) {
                return 1; // par maior que 10
            } else {
                return 2; // par até 10
            }
        } else { // número ímpar
            if (n < 0) {
                return 3; // ímpar negativo
            } else {
                return 4; // ímpar positivo
            }
        }
    }
}
