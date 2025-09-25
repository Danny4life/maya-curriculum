package lenox.exception;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if(amount > balance){
           throw new InsufficientFundsException("You don't have enough fund to make this withdraw");
        }

        balance -= amount;

        System.out.println("Withdrawal successful");


    }

    public void deposit(double amount){

        if(amount <= 0){
            throw new InvalidTransactionException("Deposit funds must be greater than zero");
        }

        balance += amount;
        System.out.println("Deposit successful");
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        try{
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.deposit(50);
        account.deposit(-10);
    }
}
