package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_finding_the_number_of_subarrays_having_negative_sumofElements {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");

            int size = sc.nextInt();

            System.out.println("\n");

            int [] marks = new int[size];

            System.out.println("Enter the elements of the array");

            for(int i =0;i<size;i++){
                  marks[i] = sc.nextInt();

            }

            System.out.println("\n");

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.print(marks[i] + " ");
            }

            System.out.println("\n");

            System.out.println("Finding the number of subarrays having negative sum of the elements ");


            int negativeCount =0;
            for(int i =0;i<size;i++){
                  int sum = 0;

                  for(int j=i;j<size;j++){
                        sum+=marks[j];

                        if(sum<0){
                              negativeCount++;
                        }
                  }
            }

            System.out.println(negativeCount);
      
      
      
      }
      
}
