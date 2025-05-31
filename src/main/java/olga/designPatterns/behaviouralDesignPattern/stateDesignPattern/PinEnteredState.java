package olga.designPatterns.behaviouralDesignPattern.stateDesignPattern;

// 2C
public class PinEnteredState implements ATMstate {
    private ATM atm;

    public PinEnteredState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void enterPin(int pin) {
        System.out.println("PIN already entered.");
    }

    public void withdrawMoney(double amount) {
        System.out.println("Withdrawing $" + amount);
        atm.setState(atm.getTransactionInProgressState());
    }

    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(atm.getNoCardState());
    }
}
