package billy.oop.classActivity7B;

public class CheckingAccount extends BankAccount{

    private double overDraftLimit;

    public CheckingAccount(String accountNumber, double accountBalance, double overDraftLimit) {
        super(accountNumber, accountBalance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if(amount > 0 && (accountBalance + overDraftLimit) >= amount){
            accountBalance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }else {
            System.out.println("Overdraft limit exceeded or invalid amount!");
        }

    }
}
