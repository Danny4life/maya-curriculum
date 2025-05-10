package olga.designPatterns.structuralDesignPattern.facadePattern;

//Client demo
public class FacadeBankDemo {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        bankService.openAccount("John Doe");
        bankService.applyLoan("John Doe", 100000);
        bankService.investInFD("John Doe", 50000);
    }

    /**
     * This example is clean, modular, and demonstrates how the Facade pattern shields clients
     * from the complexities of multiple subsystems.
     */
}
