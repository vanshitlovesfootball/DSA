import java.util.*;

public class dsa_with_java_calculating_maximum_sum_of_array {


      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size");

            int size = sc.nextInt();

            System.out.println("\n");

            System.out.println("Enter the elemens of the array ");
            int [] array = new int[size];

            for(int i =0;i<size;i++){
                  array[i] = sc.nextInt();
            }

            System.out.println("\n");

            System.out.println("The elements of the array are : ");

            for(int i=0;i<size;i++){
                  System.out.print(array[i] + " ");
            }
            // calculatig the maximum sum of the subarrays

            int maximumSum = Integer.MIN_VALUE;

            for(int i =0;i<size;i++){
                  
            int currentSum =0;

            for(int j=i;j<size;j++){
                  currentSum+=array[j];

                  maximumSum = Math.max(maximumSum ,currentSum);

                  if(currentSum<0){
                        currentSum=0;
                  }
                  
            }
                  
            }
            System.out.println("The maximum sum is : "+maximumSum);
      }
      
}
