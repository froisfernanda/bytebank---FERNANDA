package bytebank;

public class TestaMetodo {
    // Classe principal que contém o método main, que é o ponto de entrada do programa.

    public static void main(String[] args) {
        // Método main, onde a execução do programa começa.

        // Cria uma nova instância da classe Conta para Paulo, com agência 6646 e número 969060.
        Conta contaDoPaulo = new Conta(6646, 969060);
        // Deposita 100 na conta do Paulo.
        contaDoPaulo.deposita(100);
        // Deposita mais 50 na conta do Paulo.
        contaDoPaulo.deposita(50);
        // Imprime o saldo da conta do Paulo após os depósitos.
        System.out.println(contaDoPaulo.getSaldo());

        // Tenta sacar 20 da conta do Paulo.
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        // Imprime o saldo da conta do Paulo após o saque.
        System.out.println(contaDoPaulo.getSaldo());
        // Imprime se o saque foi bem-sucedido ou não (true/false).
        System.out.println(conseguiuRetirar);

        // Cria uma nova instância da classe Conta para Marcela, com agência 6644 e número 969063.
        Conta contaDaMarcela = new Conta(6644, 969063);
        // Deposita 1000 na conta da Marcela.
        contaDaMarcela.deposita(1000);

        // Tenta transferir 300 da conta da Marcela para a conta do Paulo.
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);

        // Verifica se a transferência foi bem-sucedida e imprime a mensagem correspondente.
        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

        // Imprime o saldo da conta da Marcela após a transferência.
        System.out.println(contaDaMarcela.getSaldo());
        // Imprime o saldo da conta do Paulo após receber a transferência.
        System.out.println(contaDoPaulo.getSaldo());
    }
}
