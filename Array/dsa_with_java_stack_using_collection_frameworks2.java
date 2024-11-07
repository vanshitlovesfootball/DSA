package dsa_with_java_arrays;


//in this question we have a stack with the elements as 1 2 and 3 with 3 as the top element of the stack
// we have the element 4 to be added to the bottom of the stack and then the element 1 2 and 3 as the upper element

import java.util.Stack;

public class dsa_with_java_stack_using_collection_frameworks2 {

      public static void pushData(int data , Stack<Integer>s){

            if(s.isEmpty()){
                  s.push(data);
                  return;
            }

            int top=s.pop();
            pushData(data, s);

            s.push(top); // used for adding the popped elements into the stack 

      }

      public static void main(String[] args) {
            

            Stack<Integer> s = new Stack<Integer>();

            s.push(1);
            s.push(2);
            s.push(3);

            pushData(4, s);

            while(!s.isEmpty()){
                  System.out.println(s.peek());
                  s.pop();

            }
      }
      
}
