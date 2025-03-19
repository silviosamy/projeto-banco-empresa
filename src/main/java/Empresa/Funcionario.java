package Empresa;

import java.util.List;

public class Funcionario {

    private String nome;
    private List<Banco> listBanco;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public List<Banco> getListBanco() {
        return listBanco;
    }

    public void setListBanco(List<Banco> listBanco) {
        this.listBanco = listBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
