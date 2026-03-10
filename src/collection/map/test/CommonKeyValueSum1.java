package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> sum = new HashMap<>();

        for (String map2Key : map2.keySet()) {
            if(map1.containsKey(map2Key)){
                int sumValue = map1.get(map2Key) + map2.get(map2Key);
                sum.put(map2Key, sumValue);
            }
        }
        System.out.println(sum);
    }
}
