package secao14.exercicioFixacao.application;

import secao14.exercicioFixacao.model.entities.Account;
import secao14.exercicioFixacao.model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("withdraw liimit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();
            account.withdraw(amountWithdraw);
            System.out.printf("New balance: %.2f\n", account.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Error: Enter with correct data type");
        }
        catch (RuntimeException e){
            System.out.println("Error: Unexpected error");
        }
        finally {
            sc.close();
        }
    }
}
