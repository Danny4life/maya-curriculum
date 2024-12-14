package olga.queue.classActivity2C.model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.isFemale() && !s2.isFemale()){
            return -1; // s1 is a female, prioritize over s2
        } else if (!s1.isFemale() && s2.isFemale()) {
            return 1; // s2 is a female, prioritize over s1
        } else if (s1.isMale() && !s2.isMale()) {
            return -1; // s1 is a male, prioritize over s2
        } else if (!s1.isMale() && s2.isMale()) {
            return 1; // s2 is a male, prioritize over s1
        }else{
            return 0; // equal priority
        }
    }
}
