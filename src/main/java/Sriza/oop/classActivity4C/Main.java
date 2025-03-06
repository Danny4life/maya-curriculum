package Sriza.oop.classActivity4C;

public class Main {

    public static void main(String[] args) {
        CentralBank cbn = new CentralBank();
        UbaBank uba = new UbaBank();
        ZenithBank zn = new ZenithBank();

        System.out.println("Central Bank Interest Rate is: " + cbn.getInterestRate());
        System.out.println("Uba Bank Interest Rate is: " + uba.getInterestRate());
        System.out.println("Zenith Bank Interest Rate is: " + zn.getInterestRate());
    }
}
