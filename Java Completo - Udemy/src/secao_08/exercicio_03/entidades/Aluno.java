package secao_08.exercicio_03.entidades;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia(){
        return nota1 + nota2 + nota3;
    }

    public void verificarMedia(){
        if((calcularMedia() >= 60) && (calcularMedia() <= 100)){
            System.out.println("Aprovado!");
        }else if((calcularMedia() < 60) && (calcularMedia() >= 0)){
            System.out.println("Reprovado!");
            System.out.println("Faltou " + String.format("%.2f", 60 - calcularMedia()) + " pontos.");
        }else{
            System.out.println("Nota inválida!");
        }
    }
}
