package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_stack_using_collection_frameworks5 {

      public static void pushData(int data,Stack<Integer> stack){
            if(stack.isEmpty()){

                  stack.push(data);
                  return;  // without the function does not know when to stop and it will lead to infinite recursive calls
// if we dont write then , when the stack is empty  it adds 40 and removes and this will continue infinite number of times
            }

            int top = stack.pop();
            pushData(data, stack);

            stack.push(top);
      }

      public static void main(String[] args) {
            Stack<Integer> stack = new Stack<Integer>();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Stack is : "+stack);

            pushData(40,stack);


            System.out.println("Stack after adding 40 to the stack is : "+stack);

            //[40, 10, 20, 30] 

            int position = stack.search(stack.peek());

            System.out.println("The value of position is : "+position);

            System.out.println(stack.pop());

            System.out.println("Stack is : "+stack);


         
            int position3 = stack.search(stack.peek());
            
            System.out.println("The value of position is : "+position3);

            





      }
      
}
