import java.util.Scanner;

public class Ex2 {
    static final int N = 30;
    public static void main(String[] args) {

        int rms[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        int n = entradaDados(rms, nota1, nota2);

        for (int i = 0; i < n ; i++) {
            System.out.println(rms[i]);
        }

    }

    public  static int entradaDados(int[]rms, double[] nota1, double[] nota2){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int rmLido = 0;

        while (n < N) {
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

            n++;
            System.out.println();
        }
        return n;
    }
}
