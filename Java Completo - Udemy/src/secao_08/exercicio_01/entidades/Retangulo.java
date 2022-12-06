package secao_08.exercicio_01.entidades;

public class Retangulo {
    public double altura;
    public double largura;

    public double calcularArea(){
        return altura * largura;
    }

    public double calcularPerimetro(){
        return (2 * altura) + (2 * largura);
    }

    public double calcularDiagonal(){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}
