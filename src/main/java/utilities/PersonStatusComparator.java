package utilities;

import models.SchoolPersonnel;

import java.util.Comparator;

public class PersonStatusComparator implements Comparator<SchoolPersonnel> {

    @Override
    public int compare(SchoolPersonnel p1, SchoolPersonnel p2) {

        return Integer.compare(p2.getLevel(),p1.getLevel());
    }
}


/*if (p1.getLevel() < p2.getLevel()){
            return 1;
        } else if (p1.getLevel() > p2.getLevel()) {
            return -1;
        } else if () {

        }
*/