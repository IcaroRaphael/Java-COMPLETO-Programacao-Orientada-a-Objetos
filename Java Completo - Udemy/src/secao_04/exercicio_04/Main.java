package secao_04.exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor
        que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário
        do funcionário, com duas casas decimais.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número do funcionário: ");
        int nFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        int nHoras = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        double salarioFuncionario = valorHora * nHoras;
        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY = U$%.2f\n", salarioFuncionario);

        sc.close();
    }
}
