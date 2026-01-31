package Set;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(4);
        ts.add(5);
        ts.add(1);
        System.out.println(ts);
        ts.clear();
        ts.add(12);
        ts.add(-12);
        System.out.println(ts);
    }
}
