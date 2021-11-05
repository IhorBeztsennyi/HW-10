import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearCongruentialGenerator {

    public static void main(String[] args) {
        System.out.println(generator(25214903917L, 11, (long)2e+48, 50).collect(Collectors.toList()));
    }

    public static Stream<Long> generator(long a, long c, long m, long seed) {

        Stream<Long> result = Stream.iterate(seed, s -> (a * s + c) % m)
                .limit(100);
        return result;
    }
}
