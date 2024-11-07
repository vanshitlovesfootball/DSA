package dsa_with_java_arrays;
import java.util.Scanner;

public class dsa_with_java_average_of_the_array {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array");
            int size = sc.nextInt();

            System.out.println("\n");
            System.out.println("Enter the elements of the array");

            int [] arr= new int[size];

            for(int i = 0;i<size;i++){

                  arr[i] = sc.nextInt();

            }
            System.out.println("\n");

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.println(arr[i]);
            }

            int sum = 0;

            for(int i =0;i<size;i++){
                  sum = sum+arr[i];
            }

            System.out.println("The sum of the elements of the array is : "+sum);

            System.out.println("\n");

            System.out.println("The average of the elements of the array is : "+sum/size);


      }
      
}
