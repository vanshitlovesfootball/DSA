package dsa_with_java_arrays;

import java.util.LinkedList;

public class dsa_with_java_linkedlits {

      public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
            
            list.addFirst("you");
            list.addFirst("love");
            list.addFirst("I");

            System.out.println(list);

            list.addLast("too");
            System.out.println(list);


            int size=list.size();
            System.out.println(size);



            for(int i =0;i<list.size();i++){
                  System.out.print(list.get(i) + " -> ");
            }


            System.out.println("null");

            System.out.println(list);

            list.removeFirst();
            System.out.println(list);


            System.out.println(list.size());

            for(int i =0;i<size;i++){
                  System.out.print(list.get(i) + " -> ");
            }

            System.out.println("null");

            
      }
      
}
