package projetoEmpresa;

import java.util.List;

public class Funcionario {

    private String nome;
    private List<Carro> listCarros;

    @Override
    public String toString() {
        return nome;
    }

    public Funcionario() {

    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.listCarros = listCarros;
    }

    public List<Carro> getListCarros() {
        return listCarros;
    }

    public void setListCarros(List<Carro> listCarros) {
        this.listCarros = listCarros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return listCarros;
    }

    public void setCarros(List<Carro> listCarros) {
        this.listCarros = listCarros;
    }
}
