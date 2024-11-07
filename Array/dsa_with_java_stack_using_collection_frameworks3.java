package dsa_with_java_arrays;

import java.util.Stack;

public class dsa_with_java_stack_using_collection_frameworks3 {

      public static void main(String[] args) {
            Stack<Integer> s = new Stack<Integer>();
            s.push(10);

            s.push(20);
            s.push(30);
            s.push(40);

            System.out.println("Stack is : "+s);

            // s.peek();
            System.out.println(s.peek());

            System.out.println(s.pop());

            System.out.println("New stack is : "+s);

            int position = s.search(30);
            System.out.println("The place of the above element is : "+position);

            // the position of the element present at the top of the stack is 1

            int position2 = s.search(80);

            System.out.println("The place of the above element is : "+position2);

            // if the element we are searching for is not present in the stack then it will return -1




      }
      
}
