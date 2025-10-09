public class Teste5
{

    /**
     * Calcula a porcentagem de desconto com base no cadastro do cliente e no valor da compra.
     * * @param clienteCadastrado Verdadeiro se o cliente possui cadastro.
     * @param valorCompra O valor total da compra.
     * @return A porcentagem de desconto aplicada (ex: 0.25 para 25%).
     */
    public static double calcularDesconto(boolean clienteCadastrado, double valorCompra) {

        // Condição B: Compra acima de R$ 500,00
        boolean compraAlta = valorCompra > 500.0;

        // 1. Cliente cadastrado E Compra > R$ 500  --> 25%
        if (clienteCadastrado && compraAlta) {
            return 0.25; // 25%
        }

        // 2. Compra > R$ 500 (e não cadastrado, pois o 25% falhou) --> 15%
        // NOTA: Se o cliente estivesse cadastrado, já teria retornado 25%
        else if (compraAlta) {
            return 0.15; // 15%
        }

        // 3. Cliente cadastrado (e compra <= R$ 500) --> 10%
        else if (clienteCadastrado) {
            return 0.10; // 10%
        }

        // 4. Nenhuma regra se aplica --> 0%
        else {
            return 0.0; // 0%
        }
    }

    // --- EXEMPLO DE USO / TESTE MANUAL ---
    public static void main(String[] args) {
        // CT 1: Não Cadastrado, Compra Baixa (0%)
        System.out.println("CT 1: Desconto (false, 300.00) = " + calcularDesconto(false, 300.00));

        // CT 2: Cadastrado, Compra Baixa (10%)
        System.out.println("CT 2: Desconto (true, 300.00) = " + calcularDesconto(true, 300.00));

        // CT 3: Não Cadastrado, Compra Alta (15%)
        System.out.println("CT 3: Desconto (false, 700.00) = " + calcularDesconto(false, 700.00));

        // CT 4: Cadastrado, Compra Alta (25%)
        System.out.println("CT 4: Desconto (true, 700.00) = " + calcularDesconto(true, 700.00));

        // CT 5: Cadastrado, Compra no Limite (R$ 500.00) (10%)
        System.out.println("CT 5: Desconto (true, 500.00) = " + calcularDesconto(true, 500.00));
    }
}