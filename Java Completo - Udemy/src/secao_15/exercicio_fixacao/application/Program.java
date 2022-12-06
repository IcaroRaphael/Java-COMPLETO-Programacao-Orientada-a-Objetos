package secao_15.exercicio_fixacao.application;

import secao_15.exercicio_fixacao.model.entities.Account;
import secao_15.exercicio_fixacao.model.exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os dados de uma conta bancária e depois realizar um
        saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
        ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
        saque da conta.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("INSIRA OS DADOS PARA CRIAR UMA CONTA:");
            System.out.print("Nº da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Titular: ");
            String titular = sc.nextLine();
            System.out.print("Balanço inicial: ");
            double balancoInicial = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();
            System.out.println();

            Account conta = new Account(numero, titular, balancoInicial, limiteSaque);

            System.out.print("Insira a quantia para saque: ");
            double valorSaque = sc.nextDouble();
            conta.withdraw(valorSaque);

            System.out.printf("Novo balanço: R$%.2f\n", conta.getBalance());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Erro! Insira o tipo de dado correto.");
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}

//InputMismatchException
