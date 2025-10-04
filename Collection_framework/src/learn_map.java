import java.util.*;

public class learn_map {
        public static void main(String[] args){

             Map<String,Integer > maps=new HashMap<>();

            //put
            maps.put("ayush",1);
            maps.put("ateeb",2);
            maps.put("alok",3);

            System.out.println(maps);
            //overRide

            maps.put("ayush", 2);
            System.out.println(maps);

            if(!maps.containsKey("ayan")){
                maps.put("ayan",4);
            }
            System.out.println(maps);

            //itration
            for(Map.Entry<String,Integer> e: maps.entrySet()){
                System.out.println(e);
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }

            //keyset()

            //is Empty
            System.out.println(maps.isEmpty());
            System.out.println(maps.containsKey("ayushh"));
        }

}
