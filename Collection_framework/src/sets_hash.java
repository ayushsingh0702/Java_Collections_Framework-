import java.util.HashSet;
import java.util.*;

public class sets_hash {
    public static void main(String[] args){

        Set<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(9);
        set.add(6);
        set.add(5);
        set.add(4);
        System.out.println(set);

        //conatins
        System.out.println(set.contains(1));
        // isEmpty
        System.out.println(set.isEmpty());
        //size
        System.out.println(set.size());
        //clear
        set.clear();
        System.out.println(set.isEmpty());
    }
}
