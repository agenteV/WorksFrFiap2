package exercicio02;

public class Main {
    public static void main(String[] args) {
        MonitorEnergia monitor = new MonitorEnergia(10);
        monitor.registrar(2);
        monitor.registrar(1);
        monitor.registrar(3);

        System.out.println("média de consumo: " + monitor.calcularMedia());
    }
}
