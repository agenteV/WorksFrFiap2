package exercicio02;

public class MonitorEnergia {
    double [] consumo;
    int index = 0;


    public MonitorEnergia(int tamanho) {
        this.consumo = new double[tamanho];

    }

    public void registrar(double valor){
        if (index < consumo.length){

            consumo[index] = valor;
            index++;
        }
    }

    public double calcularMedia(){
        double media = 0;
        int total= 0;
        for (double valor : consumo){
            if (valor != 0){
                media += valor;
                total++;
            }
        }
        return media / total;
    }
}
