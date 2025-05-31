package olga.designPatterns.behaviouralDesignPattern.stateDesignPattern;

public class TransactionInProgressState implements ATMstate{
    private ATM atm;

    public TransactionInProgressState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Transaction in progress. Please wait.");
    }

    public void enterPin(int pin) {
        System.out.println("Transaction in progress.");
    }

    public void withdrawMoney(double amount) {
        System.out.println("Transaction already in progress.");
    }

    public void ejectCard() {
        System.out.println("Transaction complete. Card ejected.");
        atm.setState(atm.getNoCardState());
    }
}
