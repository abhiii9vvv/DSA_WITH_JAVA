package Map;

import java.util.TreeMap;
import java.util.Map;

public class treeMap {
    public static void main(String[] args) {

        // O(log n) operations (Red-Black Tree)
        TreeMap<Integer, String> tm = new TreeMap<>();

        // put()
        tm.put(4, "Av9");
        tm.put(1, "Abhinav");
        tm.put(24, "9vv");
        tm.put(10, "Coder");

        System.out.println("TreeMap: " + tm);

        // get()
        System.out.println("Get key 4: " + tm.get(4));

        // containsKey() / containsValue()
        System.out.println("Contains key 1: " + tm.containsKey(1));
        System.out.println("Contains value 'Coder': " + tm.containsValue("Coder"));

        // firstKey() / lastKey()
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());

        // ceilingKey() / floorKey()
        System.out.println("Ceiling key of 5: " + tm.ceilingKey(5));
        System.out.println("Floor key of 5: " + tm.floorKey(5));

        // higherKey() / lowerKey()
        System.out.println("Higher key than 4: " + tm.higherKey(4));
        System.out.println("Lower key than 4: " + tm.lowerKey(4));

        // remove()
        tm.remove(10);
        System.out.println("After removal: " + tm);

        // iterate
        System.out.println("Iterating TreeMap:");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
