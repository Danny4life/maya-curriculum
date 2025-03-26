package Sriza.designPattern.classActivity6;

// Step 5- Concrete Abstraction: A specific type of remote control
public class TvRemoteControl extends RemoteControl{
    public TvRemoteControl(Device device) {
        super(device);
    }

    @Override
    void turnOn() {
        System.out.println("Using Remote:");
        device.turnOn();

    }

    @Override
    void turnOff() {
        System.out.println("Using Remote:");
        device.turnOff();
    }
}
