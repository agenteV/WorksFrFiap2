import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rms[] = new int[30];
        double nota1[] = new double[30];
        double nota2[] = new double[30];
        double media[] = new double[30];
        int rmAprovado[] = new int[30];

        int n = 0;
        int rmLido = 0;

        while (n < 30) {
            System.out.print("Digite o RM do aluno (negativo para finalizar): ");
            int rm = sc.nextInt();

            if (rm < 0) {
                break;
            }
            System.out.println("Digite a nota 1: ");
            double notas1 = sc.nextDouble();
            System.out.println("Digite a nota 2:");
            double notas2 = sc.nextDouble();

            rms[n] = rm;
            nota1[n] = notas1;
            nota2[n] = notas2;

            media[n] = (notas1 + notas2) / 2.0;

            if (media[n] >= 6.0) {
                rmAprovado[rmLido] = rm;
                rmLido++;
            }

            n++;
            System.out.println();
        }

        System.out.println("\n=== RESULTADO DOS ALUNOS ===\n");
        System.out.println("------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-15.2f\n", rms[i], media[i]);
        }
        System.out.println("\n=== ALUNOS APROVADOS ===\n");
        if (rmLido > 0) {
            System.out.println("RMs dos alunos aprovados:");
            for (int i = 0; i < rmLido; i++) {
                System.out.println("- " + rmAprovado[i]);
            }
            System.out.println("\nTotal de aprovados: " + rmLido);
        } else {
            System.out.println("Nenhum aluno foi aprovado!");
        }

        System.out.println("\nTotal de alunos: " + n);
}
}
