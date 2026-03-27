package aiz.collections.aitTechInstitute.model;

public class Developers {

    String name;

    boolean isFemale;

    boolean isMale;


    public Developers(String name, boolean isFemale, boolean isMale) {
        this.name = name;
        this.isFemale = isFemale;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isMale() {
        return isMale;
    }
}
