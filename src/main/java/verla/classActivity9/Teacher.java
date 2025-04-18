package verla.classActivity9;

import jakarta.persistence.OneToOne;

public class Teacher {

    String name;

    @OneToOne
    Student student;
}
