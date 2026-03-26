package M6Ex3.main;

import M6Ex3.departamento.Departamento;
import M6Ex3.funcionarios.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("f01","Vitor", "Gerenete", 35000);
        Funcionario f2 = new Funcionario("f02","Gigi", "Diretora", 95000);
        Funcionario f3 = new Funcionario("f03","Enzo", "Estagiario", 2000);

        Departamento departamento = new Departamento("TI01", "TI", 20);
        departamento.adicionarFuncionarios(f1);
        departamento.adicionarFuncionarios(f2);
        departamento.adicionarFuncionarios(f3);

        System.out.println(departamento.buscarFuncionario("f02"));
    }
}
