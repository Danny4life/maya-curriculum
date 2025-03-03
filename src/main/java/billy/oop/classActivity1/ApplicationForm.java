package billy.oop.classActivity1;

public class ApplicationForm {
    private String name;

    private String gender;

    private int age;

    public ApplicationForm(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static void main(String[] args) {

        ApplicationForm formObj = new ApplicationForm("John", "MALE", 20);
    }
}
