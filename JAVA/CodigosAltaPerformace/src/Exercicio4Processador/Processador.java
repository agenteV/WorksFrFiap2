package Exercicio4Processador;

import FilasSequencias.filas.FilaInt;
import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();

        int opcao;

        do {
            System.out.println("\n1- Submeter processo para execução");
            System.out.println("2- Executar processo");
            System.out.println("3- Shutdown");
            opcao = le.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o PID:");
                    int pid = le.nextInt();
                    fila.enqueue(pid);
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há processos na fila");
                    } else {
                        int pidExec = fila.dequeue();
                        System.out.println("Processo " + pidExec + " será atendido agora");
                        System.out.println("...Executando...");
                        System.out.println("Processo foi concluído? (1-sim):");

                        int resp = le.nextInt();
                        if (resp == 1) {
                            System.out.println("O processo " + pidExec + " foi finalizado!");
                        } else {
                            // volta para a fila se não terminou
                            fila.enqueue(pidExec);
                        }
                    }
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Há processos aguardando na fila!");
                        System.out.println("Deseja encerrar todos? (1-sim)");
                        int res = le.nextInt();

                        if (res == 1) {
                            while (!fila.isEmpty()) {
                                System.out.println("Processo " + fila.dequeue() + " foi encerrado");
                            }
                        }
                    }
                    System.out.println("Shutdown...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);

        le.close();
    }
}