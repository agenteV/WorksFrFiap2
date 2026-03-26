package M6Ex3.funcionarios;

public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualBonus;
    private boolean ativo;

    public Funcionario(String matricula, String nome, String cargo, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.ativo = true;
    }
    public double calcularSalarioLiquido(){
        double bonus = salarioBase * percentualBonus / 100;
        return salarioBase + bonus * 0.85;
    }

    public void aplicarAumento(double percentual) {
        if (percentual >= 0 && percentual <= 30) {
            salarioBase *= (1 + percentual / 100);
        }
    }

    public void aplicarBonus(double percentual){
        if (percentual >= 0){
            percentualBonus = percentual;
        }
    }

    public void desligar(){
        this.ativo = false;
        this.percentualBonus = 0;
    }

    public boolean isAtivo() {
        return ativo;
    }



    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
