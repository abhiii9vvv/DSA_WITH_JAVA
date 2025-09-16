package ArrayList;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        Integer i= Integer.valueOf(4);

        Float f=Float.valueOf(4.3f);

        System.out.println(i);
        System.out.println(f);


        ArrayList<Integer> l1= new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        System.out.println(l1.get(2));

        for (int j = 0; j < l1.size(); j++) {
            System.out.println(l1.get(j));
        }

        l1.add(1,100);

        l1.set(1,10);
        l1.remove(1);

        System.out.println(l1);


        }




//        ArrayList<Float> l2= new ArrayList<>();
//        ArrayList<Character> l3= new ArrayList<>();
}
