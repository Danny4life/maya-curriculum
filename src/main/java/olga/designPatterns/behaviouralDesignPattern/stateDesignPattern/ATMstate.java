package olga.designPatterns.behaviouralDesignPattern.stateDesignPattern;
// 1.
public interface ATMstate {
    void insertCard();
    void enterPin(int pin);
    void withdrawMoney(double amount);
    void ejectCard();
}
