import java.util.*;

public class Linkedist {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        //add()

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //addFirst
        list.addFirst(7);

        //addLast
        list.addLast(10);
        System.out.println(list);

        //get_first
        System.out.println(list.getFirst());
        // get last
        System.out.println(list.getLast());
        //remove first
        System.out.println(list.removeFirst());
        System.out.println(list);

        //remove last
        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
