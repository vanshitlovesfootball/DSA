package dsa_with_java_arrays;
import java.util.Stack;

public class dsa_with_java_collection_frameworks_stacks {


      public static void transferElementsintostack2inreverseorder(Stack<Integer> stack,Stack<Integer> stack2 ){

            while(!stack.isEmpty()){   // till the stack is not empty push all the removed elements from stack1 into stack2
                  stack2.push(stack.pop());
            }
      }
      
      public static void main(String[] args) {
            Stack<Integer> stack = new Stack<Integer>();
            Stack<Integer> stack2 = new Stack<Integer>();
            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println("Stack is : "+stack);
            // Stack is : [1, 2, 3]

            transferElementsintostack2inreverseorder(stack , stack2);

            System.out.println("Stack 2 is : "+stack2);

      }
      
}
