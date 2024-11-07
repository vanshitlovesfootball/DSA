package dsa_with_java_arrays;
import java.util.LinkedList;

public class dsa_with_java_linked_list_reversing {
      public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList<Integer>();

            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);

            for(int i=0;i<ll.size();i++){
                  System.out.print(ll.get(i) + " -> ");
            }
            System.out.println("null");


            //let's reverse the order of list

            for(int i =ll.size()-1;i>=0;i--){
                  System.out.print(ll.get(i) + " -> ");
            }
            System.out.println("null");
           
      }

      
      
}
