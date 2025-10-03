import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args){

       //queue hi implement karta hai

        ArrayDeque<Integer> arr=new ArrayDeque<>();

        arr.add(1);
        arr.addFirst(2);
        arr.addLast(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        //peek
        System.out.println(arr.peekFirst());
        System.out.println(arr.peekLast());
        System.out.println(arr);

        //poll
        System.out.println(arr.poll());
        System.out.println(arr.pollFirst());
        System.out.println(arr.pollLast());
        System.out.println(arr);


    }
}
