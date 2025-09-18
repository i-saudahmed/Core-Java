package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class filterMapReduce {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(6, 3, 1, 2);

        // ? behind the scenes of filter
        // Predicate<Integer> p = new Predicate<Integer>() {
        // public boolean test(Integer n) {
        // return n % 2 == 0;
        // }
        Predicate<Integer> p = n -> n % 2 == 0;

        // ? behind the scenes of map
        Function<Integer, Integer> fun = n -> n * 2;

        // int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0,
        // (c, e) -> c + e);
        // int result = nums.stream().filter(p).map(fun).reduce(0, (c, e) -> c + e);

        // if you do parallelstream sorting will not work bcz they need all elements
        // together and in multiple threads no sorting will work not sync everyone work
        // independent

        // Stream<Integer> sortedValues = nums.parallelStream().filter(p).sorted();
        Stream<Integer> sortedValues = nums.stream().filter(p).sorted();

        sortedValues.forEach(n -> System.out.println(n));

        // System.out.println(result);
    }

}
