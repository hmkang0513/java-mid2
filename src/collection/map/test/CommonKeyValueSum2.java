package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A",1,"B",2,"C",3);
        Map<String, Integer> map2 = Map.of("B",4,"C",5,"D",6);

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
