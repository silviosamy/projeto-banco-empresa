package projetoEmpresa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        List<Empresa> listEmpresas = new ArrayList<>();
        List<Funcionario> listFuncionarios1 = new ArrayList<>();
        List<Funcionario> listFuncionarios2 = new ArrayList<>();


        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("André");
        Funcionario funcionario3 = new Funcionario("Maria");
        listFuncionarios1.add(funcionario1);
        listFuncionarios1.add(funcionario2);
        listFuncionarios2.add(funcionario3);

        List<Carro> listCarros1 = new ArrayList<>();
        List<Carro> listCarros2 = new ArrayList<>();
        List<Carro> listCarros3 new ArrayList<>();

        Carro carro1 = new Carro("Peugeot");
        Carro carro2 = new Carro("Marea");
        Carro carro3 = new Carro("Kombi");
        Carro carro4 = new Carro("Porsche");
        Carro carro5 = new Carro("Opala");
        listCarros1.addAll(Arrays.asList(carro1, carro2));
        listCarros2.add(carro3);
        listCarros3.addAll(Arrays.asList(carro4, carro5));


        Empresa empresa1 = new Empresa("Nubank", listFuncionarios1);
        Empresa empresa2 = new Empresa("Samsung", listFuncionarios2);
        empresa1.setListFuncionarios(listFuncionarios1);
        empresa2.setListFuncionarios(listFuncionarios2);
        listEmpresas.add(empresa1);
        listEmpresas.add(empresa2);


        for (Empresa empresa : listEmpresas) {
            System.out.println("Empresa: " + empresa.getNome() +
                    "\nFuncionários:" + empresa.getListFuncionarios());
        }


    }

}
