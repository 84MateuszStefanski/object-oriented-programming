package set;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {

    public static List<String> removeDuplicates(List<String> list) {
        List<String> withoutDuplicat = new ArrayList<>();
        for (String dupl : list){
            if (!withoutDuplicat.contains(dupl))
                withoutDuplicat.add(dupl);
        }
        return withoutDuplicat;
    }


    public static List<String> removeDuplicates2(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);

        return new ArrayList<>(set);
    }

    public static List<String> removeDuplicatesStream(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }


}
