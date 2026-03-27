package aiz.collections.aitTechInstitute.model;

import java.util.Comparator;

public class DeveloperComparator implements Comparator<Developers> {
    @Override
    public int compare(Developers d1, Developers d2) {

        if(d1.isFemale() && !d2.isFemale()){
            return -1; // d1 is a female,give priority over d2
        } else if (!d1.isFemale() && d2.isFemale()) {
            return 1;  // d2 is the female, give priority over d1

        } else if (d1.isMale() && !d2.isMale()) {
            return -1; // d1 is a male, prioritize over d2

        } else if (!d1.isMale() && d2.isMale()) {
            return 1;

        }else {
            return 0; // equal priority
        }
    }
}
