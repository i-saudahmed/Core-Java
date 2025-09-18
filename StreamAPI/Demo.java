package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 1, 6);

        // for (int i = 0; i < nums.size(); i++) {
        // System.err.println(nums.get(i));
        // }

        // for (Integer n : nums) {
        // System.out.println(n);
        // }

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n){
        // System.out.println(n);
        // }
        // };

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(c -> c * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);
        // System.out.println(result);
        int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);
        System.out.println(result);
        // nums.forEach(n -> System.out.println(n));
    }

}
