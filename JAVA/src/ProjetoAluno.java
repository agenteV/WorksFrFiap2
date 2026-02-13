import java.util.Scanner;

public class ProjetoAluno {
    //atributos ou propriedades ou variaveis de instância("objeto")
    int rm;
    String nome;
    String curso;
    double nota1;
    double nota2;

    public double calcularMedia() {
        double media;
        media = (nota1 + nota2) / 2;
        return media;
    }

    public String status(){
        if (calcularMedia() >= 6){
            return "Aprovado ";
        }
        return "Reprovado ";
    }
}
