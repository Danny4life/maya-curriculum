package olga.designPatterns.behaviouralDesignPattern.stateDesignPattern;

// 2B
public class CardInsertedState implements ATMstate {
    private ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN.");
            atm.setState(atm.getPinEnteredState());
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    public void withdrawMoney(double amount) {
        System.out.println("Enter PIN first.");
    }

    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(atm.getNoCardState());
    }
}
