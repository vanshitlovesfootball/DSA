package dsa_with_java_arrays;
import java.util.Scanner;





public class dsa_with_java_array2 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();

            int numbers[] = new int[size];
            System.out.println("\n");

            System.out.println("Enter the values of numbers ");
            for(int i =0;i<size;i++){

                  numbers[i] = sc.nextInt();

               
            }

            System.out.println("\n");

            System.out.println("The entered numbers are : ");

            for(int i =0;i<size;i++){
                  System.out.println(numbers[i]);
            }



      }
      
}
