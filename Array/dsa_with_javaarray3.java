package dsa_with_java_arrays;
import java.util.Scanner;


public class dsa_with_javaarray3 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();

            System.out.println("Enter the elements of the array");

            int arr [] = new int[size];

            for(int i =0; i<size;i++){
                  arr[i]= sc.nextInt();
            }


            System.out.println("\n");

            System.out.println("The numbers entered are : ");

            for(int i =0;i<size;i++){
                  System.out.println(arr[i]);
            }


            System.out.println("Enter the element to be searched :");
 
            int n = sc.nextInt();

         for(int i =0;i<size;i++){
            if(arr[i]==n){
                  System.out.println("n is present at the index : "+i);
            }

            // else{
            //       System.out.println("n is not present in the array");
            // }
         }
        
      }


          
      
}
