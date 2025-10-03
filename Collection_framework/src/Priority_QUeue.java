import java.util.*;

public class Priority_QUeue {
    public static void main(String[] args){

        Queue<Integer> pr_queue=new PriorityQueue<>(Comparator.reverseOrder());

        pr_queue.offer(1);
        pr_queue.offer(2);
        pr_queue.offer(3);
        pr_queue.offer(4);
        pr_queue.offer(5);
        pr_queue.offer(6);
        System.out.println(pr_queue);

        //poll

        System.out.println(pr_queue.poll());
        System.out.println(pr_queue);

        //peek
        System.out.println(pr_queue.peek());

        //

    }
}
