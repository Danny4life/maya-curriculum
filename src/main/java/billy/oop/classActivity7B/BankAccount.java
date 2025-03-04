package billy.oop.classActivity7B;

public abstract class BankAccount {

    protected String accountNumber;

    protected double accountBalance;

    public BankAccount(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    abstract void withdraw(double amount);

    public void deposit(double amount){
        if(amount > 0){
            accountBalance += amount;
            System.out.println("Deposited: $" + amount);
        }else {
            System.out.println("Incorrect deposit amount");
        }
    }

    public void showBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Account Balance: $" + accountBalance);
    }
}
