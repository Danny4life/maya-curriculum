package olga.designPatterns.creationalDesignPattern.builderPattern.classActivity2;

public class Computer {

    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasGraphicsCard;


    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isHasGraphicsCard() {
        return hasGraphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", graphics=" + hasGraphicsCard + "]";
    }

    public static  class Builder{
        private String CPU; // Required field
        private String RAM; // Required field
        private String storage; // Optional field
        private boolean hasGraphicsCard; // Optional field

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean value) {
            this.hasGraphicsCard = value;
            return this;
        }


        //This is where the actual object gets created.
        //It calls the private constructor and returns a Computer instance.
        public Computer build() {
            return new Computer(this);
        }


    }
}
