//library
import java.util.Queue;
import java.util.LinkedList;

//linklist queue interface ko usr akr raha hota hai

public class queue_Linklist {
    public static  void main(String[] args){
        Queue<Integer> inti =new LinkedList<>();

        //offer()----->element insert in queue
        inti.offer(1);
        inti.offer(2);
        inti.offer(3);
        inti.offer(4);
        inti.offer(5);
        System.out.println(inti);

        //poll------>element ko bahae nikale ka kam karega auur elements ko return bhi kar dege ki kon sa element bhar nikal  hai
        System.out.println(inti.poll());

        //peek--->Get head without removing
        System.out.println(inti.peek());

        //size---->get the size of the queue
        System.out.println(inti.size());

        //contains------>contaning element
        System.out.println(inti.contains(3));


        for(Integer num:inti){
            System.out.println(num);

        }
        //clear
        inti.clear();
        System.out.println(inti);


    }
}
