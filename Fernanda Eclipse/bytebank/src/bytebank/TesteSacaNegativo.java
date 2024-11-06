package bytebank;

public class TesteSacaNegativo {
    // Classe principal que contém o método main, que é o ponto de entrada do programa.

    public static void main(String[] args) {
        // Método main, onde a execução do programa começa.

        // Cria uma nova instância da classe Conta com agência 6646 e número 969060.
        Conta conta = new Conta(6646, 969060);
        // Deposita 100 na conta.
        conta.deposita(100);
        // Tenta sacar 101 da conta e imprime o resultado (true ou false).
        System.out.println(conta.saca(101));

        // Tenta sacar 101 da conta novamente.
        conta.saca(101);

        // Imprime o saldo da conta após as tentativas de saque.
        System.out.println(conta.getSaldo());
    }
}
