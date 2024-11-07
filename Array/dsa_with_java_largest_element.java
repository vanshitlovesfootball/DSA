package dsa_with_java_arrays;
import java.util.Scanner;

public class dsa_with_java_largest_element {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array");
            int size = sc.nextInt();

            System.out.println("\n");

            int [] array3 = new int[size];

            System.out.println("Enter the elements of the array");


            for(int i=0;i<size;i++){
                  array3[i] = sc.nextInt();

            }

            System.out.println("/n");

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){

                  System.out.println(array3[i]);
              
                  
            }

            int largest = array3[0];

            for(int i =0;i<size;i++){
                if(array3[i]>largest){
                  largest = array3[i];
                }

                  // System.out.println("The largest element in the array is : "+array3[i]);

            }
              System.out.println("The largest element in the array is : "+largest);
            
      
      
      }
}
