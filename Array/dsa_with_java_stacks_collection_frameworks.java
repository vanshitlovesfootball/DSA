package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_stacks_collection_frameworks {

      public static void transferElementsintostack2insameorder(Stack<Integer>  originalStack,Stack<Integer>  newStack ){

            // create a temporary stack

            Stack<Integer> temporaryStack= new Stack<Integer>();

            while(!originalStack.isEmpty()){
                  temporaryStack.push(originalStack.pop());

                  
            }
            // System.out.println("Temporary stack is : "+temporaryStack);


            // tranferring the elements of the temporary stack into the new stack

            while(!temporaryStack.isEmpty()){
                 newStack.push(temporaryStack.pop());

                 
                  
            }
            System.out.println("The new stack is : "+newStack);

      }

      public static void main(String[] args) {
            Stack<Integer>  originalStack = new Stack<Integer>();

            Stack<Integer>  newStack = new Stack<Integer>();

            originalStack.push(10);
            originalStack.push(20);
            originalStack.push(30);

            System.out.println("Original stack is : "+originalStack);

            transferElementsintostack2insameorder(originalStack, newStack);

      }
      
}
