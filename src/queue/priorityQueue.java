package queue;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        //store elements
        //and whenever you ask for peek
        // it gives you the smallest element
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.offer(1);
        pq.offer(2);
        pq.offer(224);
        pq.offer(43);
        pq.offer(-1);
        System.out.println(pq);
        System.out.println(pq.peek());

        while (!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}
