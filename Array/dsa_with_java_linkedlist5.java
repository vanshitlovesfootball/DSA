package dsa_with_java_arrays;

import java.util.LinkedList;

public class dsa_with_java_linkedlist5 {


      public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
            
            list.addFirst("Wadhera");
            list.addFirst("Vanshit");
            list.addFirst("is");
            list.addFirst("name");
            list.addFirst("My");

            System.out.println(list);

            for(int i =0;i<list.size();i++){
                  System.out.print(list.get(i)+ " -> ");
            }

            System.out.println("Null");
            System.out.println(list);


            list.set(0,"His");
            System.out.println(list);


            for(int i =0;i<list.size();i++){
                  System.out.print(list.get(i)+ " -> ");
            }

            System.out.println("null");
      
      
      }
      
}
