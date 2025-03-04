package billy.oop.classActivity7B;

public class BankingSystem {

    public static void main(String[] args) {
        // Create a Savings Account
        SavingAccount savings = new SavingAccount("SA12345", 1000, 5);
        savings.showBalance();
        savings.deposit(500);
        savings.withdraw(300);
        savings.applyInterest();
        savings.showBalance();

        System.out.println("\n-----------------------------\n");

        // Create a Checking Account
        CheckingAccount checking = new CheckingAccount("CA67890", 500, 200);
        checking.showBalance();
        checking.deposit(200);
        checking.withdraw(800);
        checking.showBalance();
    }
}
