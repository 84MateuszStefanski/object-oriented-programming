package set;

import abstractMethods.Circle;

import java.util.*;

public class SortListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Kamil");
        list.add("Zbyszek");
        list.add("Ala");

        Collections.sort(list);   // ten zapis sortuje listę alfabetycznie

        System.out.println(list);

        List<City> capitols = new ArrayList<>();
        capitols.add(new City("Warsaw", 1_700_000));
        capitols.add(new City("Berlin", 3_700_000));
        capitols.add(new City("Prague", 1_300_000));

        Collections.sort(capitols);

        for(City city : capitols) {
            System.out.println(city);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Collections.sort(capitols, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return Integer.compare(o1.getPopulation(), o2.getPopulation());
            }
        });

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Collections.sort(capitols, (o1, o2) -> Integer.compare(o1.getPopulation(), o2.getPopulation()));

        Collections.sort(capitols, Comparator.comparingInt(City::getPopulation));


        for(City city : capitols) {
            System.out.println(city);
        }


    }
}
