package olga.queue.classActivity2C.model;

import java.util.Comparator;


/**
 * 1. This class, StudentComparator,
 * is designed to compare two Student objects based on their gender.
 *
 * 2. implements Comparator<Student>: here the class implements the Comparator interface,
 * which allows it to define a custom sorting or ordering logic for Student objects.
 * The Comparator interface is generic,
 * so <Student> specifies that it will compare objects of the Student type.
 */
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
