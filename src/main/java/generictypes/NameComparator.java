package generictypes;

import java.util.Comparator;

public class NameComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        int name =  o1.getName().charAt(0) - o2.getName().charAt(0);
        if(o1.getName().charAt(0) > o2.getName().charAt())
        return name;
    }
}
