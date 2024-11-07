package dsa_with_java_arrays;
import java.util.Scanner;

public class dsa_with_java_maorily_element_in_the_array {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array");

            int size = sc.nextInt();

            System.out.println("\n");
            int array[] = new int[size];

            System.out.println("Enter the elements of the array");

            for(int i =0;i<size;i++){
                  array[i] = sc.nextInt();
            }

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.println(array[i]);
            }
            // finding the majority element in the array that is the element occuring most of the times in the array

            int majorityElement = findMajorityElement(array , size);

            if(majorityElement!=-1){
                  System.out.println("The majority element is : "+majorityElement);
            }
            else{
                  System.out.println("no such majority element")
            }

            public static int findMajorityElement(int [] array , int size){
                  for(int i =0;i<size;i++){
                        int count = 0;
                        for(int j =0;j<size;j++){
                              if(array[i]==array[j]){
                                    count=count+1;
                              }
                        }
                        if(count>size/2){
                              return array[i];

                        }
                        return -1;


                  }
            




      }
      
}
