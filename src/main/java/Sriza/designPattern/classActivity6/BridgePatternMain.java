package Sriza.designPattern.classActivity6;

// Step 6
public class BridgePatternMain {
    public static void main(String[] args) {
        // Create devices
        Device samsungTV = new SamsungTv();
        Device sonyTV = new SonyTv();

        // Use TV Remote Control with different devices
        RemoteControl samsungRemote = new TvRemoteControl(samsungTV);
        RemoteControl sonyRemote = new TvRemoteControl(sonyTV);

        // Turn ON devices
        samsungRemote.turnOn();
        sonyRemote.turnOn();

        // Turn OFF devices
        samsungRemote.turnOff();
        sonyRemote.turnOff();
    }
}
