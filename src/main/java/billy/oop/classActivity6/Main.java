package billy.oop.classActivity6;

public class Main {

    public static void main(String[] args) {


        CentralBank cb = new CentralBank();
        CapitalBank capitalBank = new CapitalBank();
        MainOneBank mb = new MainOneBank();

        System.out.println("Central Bank Interest Rate is: " + cb.getInterestRate());
        System.out.println("Capital Bank Interest Rate is: " + capitalBank.getInterestRate());
        System.out.println("Main One Bank Interest Rate is: " + mb.getInterestRate());
    }
}
