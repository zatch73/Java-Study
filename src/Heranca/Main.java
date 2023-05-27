package Heranca;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1, "Ruffy", 0.0);
        BusinessAccount bacc = new BusinessAccount(2, "Zuru", 20.0, 200.0);
        Account acc2 = new SavingsAccount(2, "Nani", 0.0, 1.0);
        Account acc3 = new BusinessAccount(2, "Nani", 20.0, 1.0);
        // UPCASTING
        bacc.withdraw(10.0);
        acc3.withdraw(10.0);
        Account aac1 = bacc;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount downcasting = (BusinessAccount) acc3;
            downcasting.loan(100.0);
        }
    }
}
