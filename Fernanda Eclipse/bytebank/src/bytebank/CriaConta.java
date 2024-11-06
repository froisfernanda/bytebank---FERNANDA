package bytebank;

public class CriaConta {
    // Classe principal que contém o método main, que é o ponto de entrada do programa.

    public static void main(String[] args) {
        // Método main, onde a execução do programa começa.

        // Cria uma nova instância de Conta com agência 6646 e número 969060.
        Conta primeiraConta = new Conta(6646, 969060);
        // Deposita 200 na primeira conta.
        primeiraConta.deposita(200);
        // Imprime o saldo da primeira conta após o depósito.
        System.out.println(primeiraConta.getSaldo());

        // Deposita 100 adicionais na primeira conta.
        primeiraConta.deposita(100);
        // Imprime o saldo atualizado da primeira conta.
        System.out.println(primeiraConta.getSaldo());

        // Cria uma nova instância de Conta com agência 6645 e número 969061.
        Conta segundaConta = new Conta(6645, 969061);
        // Deposita 50 na segunda conta.
        segundaConta.deposita(50);

        // Imprime o saldo da primeira conta.
        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        // Imprime o saldo da segunda conta.
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        // Imprime a referência da primeira conta (isso exibe o endereço de memória da instância).
        System.out.println("referenciar: " + primeiraConta);
    }
}
