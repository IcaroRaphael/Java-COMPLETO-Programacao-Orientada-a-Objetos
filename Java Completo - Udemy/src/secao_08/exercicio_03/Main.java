package secao_08.exercicio_03;

import secao_08.exercicio_03.entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
        trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao
        final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado(PASS)
        ou não(FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para
        ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Insira os dados do aluno...");
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("1º nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("2º nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("3º nota: ");
        aluno.nota3 = sc.nextDouble();
        System.out.println();

        System.out.printf("Media final: %.2f\n", aluno.calcularMedia());
        aluno.verificarMedia();

        sc.close();
    }
}
