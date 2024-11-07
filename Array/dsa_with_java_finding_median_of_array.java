package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_finding_median_of_array {

      public static double findingmedianofArray(int[] array){
            // the median is only founded when the array is sorted

            int size = array.length;

            // first sort the array
            for(int i =0;i<size-1;i++){
                  for(int j =i+1;j<size;j++){
                        if(array[i]>array[j]){
                              int temp = array[i];
                              array[i] = array[j];
                              array[j] = temp;
                        }
                  }
                  // System.out.println("The elements of the array in sorted order is : "+array[i]);
            }

            System.out.println("The sorted array is : ");
           for(int i =0;i<size;i++){
            System.out.println(array[i]);
           }
            


            if(size%2==0){            // if the array contains the even number of elements 
                  return (array[(size-1)/2]+array[size/2])/2.0;                                    
            }
            else{
                  return array[size/2];
            }


      }   


public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of array");
            int size = sc.nextInt();

            System.out.println("\n");

            
            System.out.println("Enter the elements of the array");


            int [] array= new int[size];

            for(int i =0;i<size;i++){
                  array[i] = sc.nextInt();
            }

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.println(array[i]);
            }

            System.out.println("\n");

            // finding the median of the array

            System.out.println("The median of the given array is : "+findingmedianofArray(array));


      }
      
}
