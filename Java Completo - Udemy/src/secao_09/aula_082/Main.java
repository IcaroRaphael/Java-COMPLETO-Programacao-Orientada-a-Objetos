package secao_09.aula_082;

import secao_09.aula_082.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Insira os dados para criar a conta...\n");

        System.out.print("Insira o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Você deseja realizar um depósito inicial? [S/N]: ");
        char escolha = sc.next().toUpperCase().charAt(0);

        if(escolha == 'S'){
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicial);
        }else{
            conta = new Conta(numeroConta, nome);
        }
        System.out.println();

        System.out.println("Dados da conta:");
        System.out.println(conta.toString());
        System.out.println();

        System.out.print("Insira o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.depositarDinheiro(deposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta.toString());
        System.out.println();

        System.out.print("Insira o valor do saque: ");
        double saque = sc.nextDouble();
        conta.sacarDinheiro(saque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta.toString());

        sc.close();
    }
}
