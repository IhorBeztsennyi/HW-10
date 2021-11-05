import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MixedStream {

    public static void main(String[] args) {
        Stream<String> first = Stream.of("1", "3", "5", "7", " 9", "11");
        Stream<String> second = Stream.of("2", "4", "6", "8", "10", "12", "14", "16");
        System.out.println(zip(first, second).collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        int min = Math.min(firstList.size(), secondList.size());
        return IntStream.range(0, min).mapToObj(x -> Stream.of(firstList.get(x), secondList.get(x))).flatMap(x -> x);
    }
}




