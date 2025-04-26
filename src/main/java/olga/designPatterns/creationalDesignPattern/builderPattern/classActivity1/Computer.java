package olga.designPatterns.creationalDesignPattern.builderPattern.classActivity1;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private boolean graphicsCard;


    // Telescoping constructors
    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public Computer(String cpu, String ram, String storage) {
        this(cpu, ram);
        this.storage = storage;
    }

    public Computer(String cpu, String ram, String storage, boolean graphicsCard) {
        this(cpu, ram, storage);
        this.graphicsCard = graphicsCard;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard=" + graphicsCard +
                '}';
    }
}
