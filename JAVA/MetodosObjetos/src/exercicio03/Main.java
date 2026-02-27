package exercicio03;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto(1,"arroz",25);
        System.out.println(p.getDados());
        p.aumentarValor(20);
        System.out.println(p.getDados());
    }
}
