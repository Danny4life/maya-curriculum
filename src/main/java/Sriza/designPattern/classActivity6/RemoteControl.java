package Sriza.designPattern.classActivity6;

// Step 4 - The Abstraction - Acts as a bridge between high-level control and implementation
public abstract class RemoteControl {
    protected Device device;

    // Constructor to assign an implementation
    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();
    abstract void turnOff();
}
