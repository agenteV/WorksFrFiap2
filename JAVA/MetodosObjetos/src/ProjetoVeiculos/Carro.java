package ProjetoVeiculos;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String placa, String marca, int numPortas) {
        super(placa, marca);
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Número de portas "+ numPortas;
        return aux;
    }
}
