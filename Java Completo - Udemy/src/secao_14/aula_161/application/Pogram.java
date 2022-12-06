package secao_14.aula_161.application;

import secao_14.aula_161.entities.Account;
import secao_14.aula_161.entities.BusinessAccount;
import secao_14.aula_161.entities.SavingsAccount;

public class Pogram {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
