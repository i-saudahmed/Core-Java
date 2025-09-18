package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // ? for index use list

        /// ? 1 list 2 set
        /// set extends collection

        // Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(34);
        nums.add(2);
        nums.add(14);
        nums.add(55);
        nums.add(14);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // System.out.println(nums.get(3));
        // System.out.println(nums.indexOf(34));

        // for (int n : nums) {
        // System.out.println(n);
        // }
    }

}