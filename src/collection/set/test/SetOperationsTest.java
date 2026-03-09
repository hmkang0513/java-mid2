package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>();
//        Set<Integer> union = new HashSet<>(set1);

//        for (Integer i1 : set1) {
//            union.add(i1);
//        }
//        for (Integer i2 : set2) {
//            union.add(i2);
//        }
        union.addAll(set1);
        union.addAll(set2);

        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
//        for (Integer i1 : set1) {
//            if(set2.contains(i1)){
//                intersection.add(i1);
//            }
//        }
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
//        for (Integer i1 : set1) {
//            if(!set2.contains(i1)){
//                difference.add(i1);
//            }
//        }
        System.out.println(difference);
    }
}
