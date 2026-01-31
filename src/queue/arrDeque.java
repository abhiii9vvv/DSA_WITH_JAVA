package queue;

import java.util.ArrayDeque;

public class arrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(2);
        ad.offer(6);
        ad.offer(45);
        ad.offer(57);
        System.out.println(ad.peek());
        ad.poll();
        System.out.println(ad);
    }
}
