package List;

import java.util.*;

class Data {
    public Integer num;
    public String name;

    Data(int _num, String _name) {
        this.num = _num;
        this.name = _name;
    }
}

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();

        aList.add(15);
        aList.add(12);
        aList.add(16);
        aList.add(11);

        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(0));
        aList.add(1,23);
        System.out.println(aList);

    }
}
