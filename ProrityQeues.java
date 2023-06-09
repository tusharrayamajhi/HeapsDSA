import java.util.*;
public class ProrityQeues {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(5);
        pq.add(6);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}