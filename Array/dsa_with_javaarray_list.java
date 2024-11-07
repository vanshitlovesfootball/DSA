package dsa_with_java_arrays;
import java.util.ArrayList;
import java.util.Collections;

public class dsa_with_javaarray_list {

      public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();



            //adding the elements to the list

            list.add(0);
            list.add(8);
            list.add(5);

            System.out.println(list);



            //getting the elements at the particular index

            int index=list.get(2);

            System.out.println(index);


            //adding the elements in between the list

            list.add(2,4);
            System.out.println(list);


            list.add(3,89);
            System.out.println(list);


            //set the elements of the list

            list.set(0,8);
            System.out.println(list);


            // deleting the elements from list

            list.remove(4);
            System.out.println(list);



            //returning the length of the  ArrayList


            int size = list.size();

            System.out.println(size);


            for(int i =0;i<list.size();i++){
                 
                  System.out.println(list.get(i));
            }


            //Collections is a class in java where we can use the sort method to sort the list

            Collections.sort(list);
            System.out.println(list);


      }
      
}
