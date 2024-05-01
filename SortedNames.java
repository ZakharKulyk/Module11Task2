import java.util.*;
import java.util.stream.Collectors;

public class SortedNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Julia");
        names.add("Artem");
        names.add("Victor");
        names.add("Zakhar");

        System.out.println(UpperCaseAndReverseOrder(names));
    }
    static public List<String> UpperCaseAndReverseOrder(List<String> names){
        List<String> collect = names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return  collect;
    }
}
