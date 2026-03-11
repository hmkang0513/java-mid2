package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> listIterator = list.iterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
        printAll(listIterator);
        foreach(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> setIterator = list.iterator();
//        while(setIterator.hasNext()){
//            System.out.println(setIterator.next());
//        }
        printAll(setIterator);
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator){
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    private static void foreach(Iterable<Integer> iterable){
        System.out.println("iterable = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }
}
