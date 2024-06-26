package secao08.exercicios01.ex03.application;

import secao08.exercicios01.ex03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
        trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao
        final, mostrar qual a nota do aluno no ano. Dizer também se o aluno está aprovado(PASS)
         ou não (FAILED) e, em caso negativo, quantos pontos faltam para obter o mínimo para ser
         aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este
         problema*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());
        student.academicSituation();

        sc.close();
    }
}
