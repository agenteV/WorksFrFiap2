package FilasSequencias.AtendeAluno;

import FilasSequencias.filas.FilaInt;

import java.util.Scanner;

public class AtendeAluno {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Atende 1 aluno");
            System.out.println("3- Encerra atendimento");
            opcao = le.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe o RM:");
                    int rm = le.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não há alunos aguardando.");
                    }
                    System.out.println("Aluno: "+fila.dequeue()+ "será atendido agora");
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Há alunos aguardando na fila!");
                        opcao = 0;
                    }
                    break;
                default:
                    System.out.println("Opção Invalida");


            }
        }while (opcao !=3);

    }
}
