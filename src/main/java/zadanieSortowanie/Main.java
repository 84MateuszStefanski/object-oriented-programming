package zadanieSortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Polska", 38_513_673, 312_685));
        countries.add(new Country("Niemcy", 80_655_997, 357_021));
        countries.add(new Country("Rosja", 143_367_146, 17_100_000));
        countries.add(new Country("Czechy", 10_568_779, 78_866));
        countries.add(new Country("Australia", 10_568_779, 178_866));
        countries.add(new Country("Bustralia", 10_568_779, 178_866));



        for(Country el : countries) {
            System.out.println(el);
        }
        System.out.println("--------------poniżej sortowanie po powierzchni ---------------");
        Collections.sort(countries, Comparator.comparingInt(Country::getArea));

        for(Country el : countries) {
            System.out.println(el);
        }

        System.out.println("--------------poniżej sortowanie po nazwie ---------------");

        Collections.sort(countries, Comparator.comparing(Country::getName).reversed());
        for(Country el : countries) {
            System.out.println(el);
        }

        System.out.println("--------------poniżej sortowanie po POPULACJI ---------------");

        Collections.sort(countries, Comparator.comparingInt(Country::getPopulation));
        for(Country el : countries) {
            System.out.println(el);
        }

        System.out.println("--------------poniżej sortowania różne---------------");

        Collections.sort(countries,
                Comparator.comparingInt(Country::getPopulation)
                .thenComparingInt(Country::getArea)
                .thenComparing(Country::getName)
        );

        for(Country el : countries) {
            System.out.println(el);
        }




    }
}
