package collection.set.test;

import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>();

        for (Integer i : inputArr) {
            set.add(i);
        }
        for (Integer s : set) {
            System.out.println(s);
        }
    }

}
