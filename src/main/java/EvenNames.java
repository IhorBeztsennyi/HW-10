import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNames {

    public static void main(String[] args) {

        final List<String> names = Arrays.asList("Igor", "Yevgen", "Sergiy", "Zoryan", "Oleksandr", "Taras", "Dmytro", "Tetiana", "Olga");

        List<String> evenNames = names.stream()
                .filter(name -> (names.indexOf(name) + 1) % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNames);

    }
}
