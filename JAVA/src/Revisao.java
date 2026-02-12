import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um valor de N: ");
        n = sc.nextInt();
        while (true){
            System.out.print(n + " ");
            if (n == 1) break;
            if (n % 2 == 1){
                n = 3 * n +1;
            }
            else {
                n = n / 2;
            }

        }
    }
}
