// library
import java.sql.SQLOutput;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){

        //initializing
        Stack<String> str=new Stack<>();

        //push
        str.push("ayush");
        str.push("ayan");
        str.push("aman");
        str.push("ateeb");
        str.push("sankulp");

        //print the statement
        System.out.println(str);


        //peek
        System.out.println(str.peek());

        //POP
        str.pop();
        System.out.println(str);
    }
}
