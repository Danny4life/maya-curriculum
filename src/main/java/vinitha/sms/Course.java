package vinitha.sms;

// Step 1 - you class
public class Course {

    // Step 2 your fields or variables
    String english;

    String maths;

    String physics;



    // Step 3 - your constructor
    public Course(String english, String physics, String maths) {
        this.english = english;
        this.physics = physics;
        this.maths = maths;
    }


    // Step 4 - getters and setters
    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }


    // Step 5 - to-string

    // The to-string is use to convert the default java object into a string
    // so we do not get the memory location of an object


    @Override
    public String toString() {
        return "Course{" +
                "english='" + english + '\'' +
                ", maths='" + maths + '\'' +
                ", physics='" + physics + '\'' +
                '}';
    }


}
