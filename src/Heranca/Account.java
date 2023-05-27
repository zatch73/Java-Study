package Heranca;

public class Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(Double value){
        this.balance -= value;
    }
    public void deposit(Double value){
        this.balance += value;
    }
}
