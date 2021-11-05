import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {

    public static void main(String[] args) {

        final List<String> names = Arrays.asList("Igor", "Yevgen", "Sergiy", "Zoryan", "Oleksandr", "Taras", "Dmytro", "Tetiana", "Olga");

        List<String> sortedNames = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNames);

    }
}
