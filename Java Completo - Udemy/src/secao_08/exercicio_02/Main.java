package secao_08.exercicio_02;

import secao_08.exercicio_02.entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado
        pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Insira os dados do funcionario...");
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println();

        System.out.println("Funcionario: " + funcionario.toString());
        System.out.println();

        System.out.print("Insira o percentual de aumento: ");
        double percentual = sc.nextDouble();
        funcionario.aumentarSalario(percentual);
        System.out.println();

        System.out.println("Dados atualizados: " + funcionario.toString());

        sc.close();
    }
}
