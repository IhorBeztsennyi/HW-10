import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSort {

    public static void main(String[] args) {
        final List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");

        List<Integer> number = numbers.stream()
                .map(s -> s.split(", "))
                .flatMap(Arrays::stream)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(number);
    }
}


