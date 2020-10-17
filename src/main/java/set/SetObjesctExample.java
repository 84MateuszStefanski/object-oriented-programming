package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetObjesctExample {

    public static void main(String[] args) {

        City warsaw = new City("Warsaw", 1_700_000);
        City berlin = new City("Berlin", 3_700_000);
        City prague = new City("Prague", 1_300_000);
        City prague2 = new City("Prague", 1_300_000);

        Set<City> capitols = new LinkedHashSet<>();
        capitols.add(warsaw);
        capitols.add(berlin);
        capitols.add(prague);
        capitols.add(prague2);

        for (City city : capitols) {
            System.out.println(city);
            System.out.println(city.hashCode());
        }


    }
}
