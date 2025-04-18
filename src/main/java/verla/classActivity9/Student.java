package verla.classActivity9;

import jakarta.persistence.OneToOne;

public class Student {

    String name;

   @OneToOne
    Teacher teacher;
}
