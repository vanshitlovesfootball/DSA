package dsa_with_java_arrays;
import java.util.Scanner;

public class dsa_with_java_array8 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array..");
            int size = sc.nextInt();

            System.out.println("\n");

            int arr[] = new int[size];

            System.out.println("Enter the elements of the array");


            for(int i =0;i<size;i++){
                  arr[i] = sc.nextInt();

            }

            System.out.println("\n");

            System.out.println("The elements of the array are ");

            for(int i =0;i<size;i++){
                  System.out.println(arr[i]);
            }


            System.out.println("\n");

            System.out.println("Arranging the elements of the array in descending order");



            for(int i =0;i<size-1;i++){
                  for(int j=i+1;j<size;j++){
                        if(arr[i]<arr[j]){
                                int temp;
                                temp=arr[i];
                                arr[i]= arr[j];
                                arr[j]= temp;     
                        }
                  }


            }


            System.out.println("The elements in the descending order ");
            System.out.println("\n");


            for(int i=0;i<size;i++){
                  System.out.println(arr[i]);
            }
      }
      
}
