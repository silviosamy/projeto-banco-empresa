package projetoEmpresa;

import java.util.List;

public class Empresa {

    private String nome;
    private List<Funcionario> listFuncionarios;

    public Empresa(String nome, List<Funcionario> listFuncionarios) {
        this.nome = nome;
        this.listFuncionarios = listFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListFuncionarios() {
        return listFuncionarios;
    }

    public void setListFuncionarios(List<Funcionario> listFuncionarios) {
        this.listFuncionarios = listFuncionarios;
    }
}