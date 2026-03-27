package henry.week_4.classActivity4.model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        if(s1.isFemale() && !s2.isFemale()){
            return -1;
        } else if (!s1.isFemale() && s2.isFemale()) {
            return 1;

        } else if (s1.isMale() && !s2.isMale()) {
            return -1;

        } else if (!s1.isMale() && s2.isMale()) {
            return 1;

        }else {
            return 0;
        }



    }
}
