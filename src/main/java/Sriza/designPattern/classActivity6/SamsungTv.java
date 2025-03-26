package Sriza.designPattern.classActivity6;

// Step 2 - Concrete Implementation: Samsung TV
public class SamsungTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is OFF");
    }
}
