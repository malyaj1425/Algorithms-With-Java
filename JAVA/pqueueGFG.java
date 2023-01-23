import java.util.*;
public class pqueueGFG {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Iterator e = queue.iterator();

        while(e.hasNext()){
            System.out.println(e.next());
        }

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        
    }
}
