package bytebank;

public class Cliente {
    // Definição da classe Cliente. Esta classe representa um cliente com nome, CPF e profissão.

    private String nome;  // Atributo privado que armazena o nome do cliente.
    private String cpf;   // Atributo privado que armazena o CPF do cliente.
    private String profissao; // Atributo privado que armazena a profissão do cliente.

    // Método público para obter o valor do atributo nome.
    public String getNome() {
        return nome;  // Retorna o valor do atributo nome.
    }

    // Método público para definir o valor do atributo nome.
    public void setNome(String nome) {
        this.nome = nome;  // Atribui o valor fornecido ao atributo nome.
    }

    // Método público para obter o valor do atributo cpf.
    public String getCpf() {
        return cpf;  // Retorna o valor do atributo cpf.
    }

    // Método público para definir o valor do atributo cpf.
    public void setCpf(String cpf) {
        this.cpf = cpf;  // Atribui o valor fornecido ao atributo cpf.
    }

    // Método público para obter o valor do atributo profissao.
    public String getProfissao() {
        return profissao;  // Retorna o valor do atributo profissao.
    }

    // Método público para definir o valor do atributo profissao.
    public void setProfissao(String profissao) {
        this.profissao = profissao;  // Atribui o valor fornecido ao atributo profissao.
    }
}