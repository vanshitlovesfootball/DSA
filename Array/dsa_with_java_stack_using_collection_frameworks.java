package dsa_with_java_arrays;
import java.util.Stack;

// import dsa_with_java_arrays.dsa_with_java_stack.Stack;

public class dsa_with_java_stack_using_collection_frameworks {

      public static void main(String[] args) {
            Stack<Integer> s= new Stack<Integer>();

            // in the above code we have implemeted the stack using collection framework where there are predefined methods like 

            s.push(1);
            s.push(2);
            s.push(3);



            while (!s.isEmpty()) {

                  System.out.println(s.peek());

                  s.pop();
                  
            }




      }
      
}
