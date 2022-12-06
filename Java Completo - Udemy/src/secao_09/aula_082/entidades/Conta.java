package secao_09.aula_082.entidades;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double balanco;

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositarDinheiro(depositoInicial);
    }

    public void depositarDinheiro(double deposito){
        this.balanco += deposito;
    }

    public void sacarDinheiro(double saque){
        this.balanco = this.balanco - saque - 5;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String toString() {
        return "Conta "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", Balanço: R$"
                + String.format("%.2f", balanco);
    }
}
