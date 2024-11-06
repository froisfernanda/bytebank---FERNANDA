package bytebank;

public class TestaBanco {
    // Classe principal que contém o método main, que é o ponto de entrada do programa.

    public static void main(String[] args) {
        // Método main, onde a execução do programa começa.

        // Cria uma nova instância da classe Cliente.
        Cliente paulo = new Cliente();
        // Define o nome do cliente.
        paulo.setNome("Paulo Silveira");
        // Define o CPF do cliente.
        paulo.setCpf("222.222.222.-22");
        // Define a profissão do cliente.
        paulo.setProfissao("programador");

        // Cria uma nova instância da classe Conta com agência 6646 e número 969060.
        Conta contaDoPaulo = new Conta(6646, 969060);
        // Deposita 100 na conta do Paulo.
        contaDoPaulo.deposita(100);

        // Define o titular da conta como sendo o cliente Paulo.
        contaDoPaulo.setTitular(paulo);
        // Imprime o nome do titular da conta (Paulo Silveira).
        System.out.println(contaDoPaulo.getTitular().getNome());
        // Imprime a referência do objeto titular da conta.
        System.out.println(contaDoPaulo.getTitular());
    }
}
