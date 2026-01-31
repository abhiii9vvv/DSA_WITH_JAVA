package Map;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        //key:value pair
        //name is the value
        //does not stores keys in the sorted order
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(1,"raj");
        mp.put(2,"abhinav");
        mp.put(3,"av9");

        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.size());
        mp.remove(2);
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println(mp.get(4));

    }
}
