package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_array_finding_smallest_number {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size");

            int size = sc.nextInt();

            System.out.println("\n");

            int arr[] = new int[size];

            System.out.println("Enter the elements of the array ");

            for(int i =0;i<size;i++){
                  arr[i] = sc.nextInt();
            }

            System.out.println("The elements of the array are :");

            for(int i =0;i<size;i++){
                  System.out.println(arr[i]);
            }
            int smallest = arr[0];

            for(int i=0;i<size;i++){
            // int smallest = arr[0];
            if (arr[i]<smallest) {

                  smallest= arr[i];

                  
            }

            }
            System.out.println("The smallest element in the array is : "+smallest);

      }
      
}
