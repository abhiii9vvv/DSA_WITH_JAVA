package Set;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
//        data strcture that store unique elements in any random order
        HashSet<Integer> hs=new HashSet<>();
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(1);
        hs.add(5);
        hs.add(2);
        hs.add(6);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);
        System.out.println(hs.size());
        hs.remove(2);
        System.out.println(hs);

        for(Integer num:hs){
            System.out.println(num);
        }

    }
}
