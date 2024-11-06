package bytebank;

public class TestaContaSemCliente {
    // Classe principal que contém o método main, que é o ponto de entrada do programa.

    public static void main(String[] args) {
        // Método main, onde a execução do programa começa.

        // Cria uma nova instância da classe Conta com agência 6646 e número 969060.
        Conta contaDaMarcela = new Conta(6646, 969060);
        // Imprime o saldo inicial da conta da Marcela (que é definido como 100 no construtor).
        System.out.println(contaDaMarcela.getSaldo());

        // Define um novo titular para a conta, criando uma instância da classe Cliente.
        contaDaMarcela.setTitular(new Cliente());
        // Imprime a referência do objeto titular da conta (Cliente).
        System.out.println(contaDaMarcela.getTitular());

        // Define o nome do titular da conta como "Marcela".
        contaDaMarcela.getTitular().setNome("Marcela");
        // Imprime o nome do titular da conta.
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
