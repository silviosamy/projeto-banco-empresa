package projetoEmpresa;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        // Criar listas para manipular no exercício.
        List<Empresa> listEmpresas = new ArrayList<>();
        List<Funcionario> listFuncionarios1 = new ArrayList<>();
        List<Funcionario> listFuncionarios2 = new ArrayList<>();

        //Criar os carros
        Carro carro1 = new Carro("Peugeot");
        Carro carro2 = new Carro("Marea");
        Carro carro3 = new Carro("Kombi");
        Carro carro4 = new Carro("Porsche");
        Carro carro5 = new Carro("Opala");

        //Criar funcionários e adicionar na lista respectivamente
        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("André");
        Funcionario funcionario3 = new Funcionario("Maria");
        listFuncionarios1.add(funcionario1);
        listFuncionarios1.add(funcionario2);
        listFuncionarios2.add(funcionario3);

        //definir
        funcionario1.adicionarCarro(carro1);
        funcionario1.adicionarCarro(carro2);
        funcionario2.adicionarCarro(carro3);
        funcionario2.adicionarCarro(carro4);
        funcionario3.adicionarCarro(carro5);

        //Criar empresa e listar os funcionários nas respectivas empresas.
        Empresa empresa1 = new Empresa("Nubank", listFuncionarios1);
        Empresa empresa2 = new Empresa("Samsung", listFuncionarios2);
        empresa1.setListFuncionarios(listFuncionarios1);
        empresa2.setListFuncionarios(listFuncionarios2);
        //Adicionar na lista de empresas, as empresas instanciadas.
        listEmpresas.add(empresa1);
        listEmpresas.add(empresa2);

        //Percorrer as listas e imprimir os valores conforme a proposta do exercício:
        //Existem Empresas, e cada mpresa tem funcionários, cada funcionário tem um carro.
        for (Empresa empresa : listEmpresas) {
            System.out.println("\nEmpresa: " + empresa.getNome());
            for (Funcionario funcionario : empresa.getListFuncionarios()) {
                System.out.println("Funcionário: " + funcionario.getNome());
                System.out.println("Carros: ");
                for (Carro carro : funcionario.getCarros()) {
                    System.out.println("-" + carro.getModelo());
                }
            }
        }
    }
}

