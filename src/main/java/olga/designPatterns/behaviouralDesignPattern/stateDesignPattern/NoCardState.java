package olga.designPatterns.behaviouralDesignPattern.stateDesignPattern;
// 2A
public class NoCardState implements ATMstate{
    private ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card inserted.");
        atm.setState(atm.getCardInsertedState());
    }

    public void enterPin(int pin) {
        System.out.println("No card inserted. Please insert a card first.");
    }

    public void withdrawMoney(double amount) {
        System.out.println("No card inserted. Please insert a card first.");
    }

    public void ejectCard() {
        System.out.println("No card to eject.");
    }
}
