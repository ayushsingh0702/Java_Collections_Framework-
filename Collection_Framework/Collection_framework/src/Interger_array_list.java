
import java.util.ArrayList;

public class Interger_array_list {
    public static void main(String[] args) {

        //initialize count by call list
        ArrayList<Integer>count=new ArrayList<>();
        ArrayList<Integer>count2=new ArrayList<>();

       //using add function
        count.add(10);
        count.add(20);
        count.add(30);

        count2.add(40);
        count2.add(50);
        count2.add(60);

        //addall
        count.addAll(count2);


        //print
        System.out.println(count);
        System.out.println(count2);

        //get()
        System.out.println(count.get(2));
        //remove
        count.remove(2);
        System.out.println(count);
        count.remove(Integer.valueOf(20));
        System.out.println(count);

        //set
        count2.set(1,90);
        System.out.println(count2);

        //contains
        System.out.println(count2.contains(90));

        for(Integer element:count2){
            System.out.println(element);
        }


       //class call
        string_array_list ayus=new string_array_list();





    }
}