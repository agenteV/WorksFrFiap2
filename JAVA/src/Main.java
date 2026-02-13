import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProjetoAluno pa = new ProjetoAluno();
        Scanner sc = new Scanner(System.in);
        double media;

        System.out.print("RM: ");
        pa.rm= sc.nextInt();
        System.out.print("Nome: ");
        pa.nome= sc.next();
        System.out.print("Curso: ");
        pa.curso= sc.next();
        System.out.print("Nota 1: ");
        pa.nota1= sc.nextDouble();
        System.out.print("Nota 2: ");
        pa.nota2= sc.nextDouble();


        media = pa.calcularMedia();
        System.out.print("media: " + media);

        System.out.print(pa.status());
    }
}