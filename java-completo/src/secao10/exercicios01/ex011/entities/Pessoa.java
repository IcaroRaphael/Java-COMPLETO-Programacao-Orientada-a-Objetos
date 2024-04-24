package secao10.exercicios01.ex011.entities;

public class Pessoa {
    private double altura;
    private char sexo;

    public Pessoa(double altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public char getSexo() {
        return sexo;
    }
}
