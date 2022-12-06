package secao_14.aula_164.application;

import secao_14.aula_164.entities.Account;
import secao_14.aula_164.entities.BusinessAccount;
import secao_14.aula_164.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pogram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //Account acc1 = new Account(1001, "Alex", 1000.0); Erro, pois a classe é abstrata
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        Account acc4 = new SavingsAccount(1004, "Bob", 300.0, 0.01);
        Account acc5 = new BusinessAccount(1005, "Anna", 500.0, 500.0);


        List<Account> list = new ArrayList<>();

        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
        list.add(acc5);

        double soma = 0;
        for(Account acc : list){
            soma += acc.getBalance();
        }
        System.out.printf("Saldo total: %.2f\n", soma);

        for(Account acc : list){
            acc.deposit(10);
        }

        for(Account acc : list){
            System.out.printf("Saldo atualizados da conta %d: $%.2f\n", acc.getNumber(), acc.getBalance());
        }
    }
}
