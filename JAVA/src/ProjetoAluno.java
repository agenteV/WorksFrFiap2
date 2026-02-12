import java.util.Scanner;

public class ProjetoAluno {
    //atributos ou propriedades ou variaveis de instância("objeto")
    int rm;
    String nome;
    String curso;
    double nota1;
    double nota2;

    public double calcularMedia(){
        double media;
        media = (nota1 + nota2) / 2;
        return media;

    }

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
        System.out.print(media);
    }
}
