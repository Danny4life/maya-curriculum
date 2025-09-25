package lenox.cafeteria.model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {

        if(s1.isFemale() && !s2.isFemale()){
            return -1;  // s1 is a female, prioritize

        } else if (!s1.isFemale() && s2.isFemale()) {
            return 1; // s2 is a female, prioritize over s1

        } else if (s1.isMale() && !s2.isMale()) {
            return -1;

        } else if (!s1.isMale() && s2.isMale()) {
            return 1;

        }else {
            return 0;  // equal priority
        }
    }
}

// male, male, male, female, male,
