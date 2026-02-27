package exercicio03;

public class Produto {
    int codigo;
    String nome;
    double valor;

    public Produto(int codigo, String nome, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public void aumentarValor(double porcentagem){
        this.valor *= (1 + porcentagem / 100);
    }

    public String getDados(){
        return codigo + "\n" + nome + "\n" + valor;
    }
}
