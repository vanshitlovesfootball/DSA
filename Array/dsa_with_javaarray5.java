package dsa_with_java_arrays;

import java.util.Scanner;

public class dsa_with_javaarray5 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array");

            int size = sc.nextInt();
            int array[] = new int[size];

            System.out.println("\n");

            System.out.println("Enter the elements of the array");

            for(int i =0;i<size;i++){

                  array[i] = sc.nextInt();
            }

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.println(array[i]);
            }

            //arranging the elements in ascending order 

            for(int i = 0;i<size-1;i++){
                  for(int j =i+1;j<size;j++){
                        if(array[i]>array[j]){
                        int temp= array[i];
                        array[i]= array[j];
                        array[j] = temp;
                        }
                  }
            }

            System.out.println("The elements in the sorted order is : ");

            for(int i=0;i<size;i++){
                  System.out.println(array[i]);
            }
           

            System.out.println("\n");


            System.out.println("Calculating the squares of the elements of the array");

            for(int i =0;i<size;i++){
                  System.out.println(array[i]*array[i]);
            }
      }
      
}
