package Heranca;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double value){
        this.loanLimit -= value;
        System.out.println("LOAN");
    }

    @Override
    public void withdraw(Double value){
        super.withdraw(value);
        this.balance -= 5;
        System.out.println(this.balance);
    }
}
