package projetoEmpresa;

public class Funcionario {

    private String nome;
    private Banco banco;

    public Funcionario(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
