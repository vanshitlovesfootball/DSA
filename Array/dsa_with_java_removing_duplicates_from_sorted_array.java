package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_removing_duplicates_from_sorted_array {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of array");
            int size = sc.nextInt();
            System.out.println("\n");

            System.out.println("Enter the elements of the array");
            int [] arr= new int[size];

            for(int i =0;i<size;i++){
                  arr[i] = sc.nextInt();
            }
            System.out.println("\n");

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.println(arr[i]);
            }

            // sort the array

            for(int i =0;i<size-1;i++){
                  for(int j=i+1;j<size;j++){
                        if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]= temp;
                  }

                  }
            }
       
            System.out.println("The sorted array is : ");
            for(int i =0;i<size;i++){
                  System.out.println(arr[i]);
            }

            int newsizeofArray = removingduplicates(arr);

            System.out.println(newsizeofArray);



            System.out.println("Array after removing duplicate elements in the array are : ");

            for(int i =0;i<newsizeofArray;i++){
                  System.out.println(arr[i]);

            }
      }

      public static int removingduplicates(int [] arr)
{
      int uniqueIndex = 0; // first element in the array is always unique

      for(int i =1;i<arr.length;i++){
            if(arr[i]!=arr[uniqueIndex]){
                  uniqueIndex++;
                  arr[uniqueIndex] = arr[i];
            }
      }
      return uniqueIndex+1;
}
      


      
}
