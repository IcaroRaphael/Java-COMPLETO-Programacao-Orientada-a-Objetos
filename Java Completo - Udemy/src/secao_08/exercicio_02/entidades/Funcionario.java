package secao_08.exercicio_02.entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return this.salarioBruto - this.imposto;
    }

    public void aumentarSalario(double percentual){
        this.salarioBruto += this.salarioBruto * (percentual/100);
    }

    public String toString() {
        return  nome
                + ", $"
                + String.format("%.2f", salarioLiquido());
    }
}
