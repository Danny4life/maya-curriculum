package billy.oop.classActivity7B;

public class SavingAccount extends BankAccount{

    private double interestRate;
    public SavingAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, accountBalance);
        this.interestRate = interestRate;
    }

    @Override
    void withdraw(double amount) {

        if(amount > 0 && amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }else {
            System.out.println("Insufficient fund!");
        }
    }

    public void applyInterest(){
        double interest = accountBalance * interestRate / 100;
        accountBalance += interest;
        System.out.println("Interest applied: $" + interest);
    }
}
