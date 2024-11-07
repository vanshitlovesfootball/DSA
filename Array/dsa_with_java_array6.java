package dsa_with_java_arrays;
import java.util.Scanner;





public class dsa_with_java_array6 {

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

            System.out.println("\n");

            System.out.println("The reverse order of array elements are : ");


            for(int i = size-1;i>=0;i--){
                  System.out.println(numbers[i]);
            }


            // int sum=0;

            // for(int i =0;i<size;i++){
            //       sum=sum+numbers[i];
            // }

            // System.out.println("Sum of elements in the array is : "+sum);
            System.out.println("\n");


            System.out.println("The even number elements in the number array are :");


            for(int i =0;i<size;i++){
                  if(numbers[i]%2==0){
                        System.out.println(numbers[i]+" ");
                  }

            }
    }

}
