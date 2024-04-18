package secao09.exercicios.exercicio_fixacao.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance = 0.0;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= (amount + 5);
    }

    @Override
    public String toString() {
        return "Account "
                + number
                + ", Holder: " + holder
                + ", balance: $"
                + String.format("%.2f", balance);
    }
}
