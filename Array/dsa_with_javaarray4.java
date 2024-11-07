package dsa_with_java_arrays;

import java.util.Scanner;

public class dsa_with_javaarray4 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of array");
            int size = sc.nextInt();

            int [] marks = new int[size];

            System.out.println("\n");

            System.out.println("Enter the values of marks");

            for(int i=0;i<size;i++){

                  marks[i]= sc.nextInt();
                  
            }
            System.out.println("\n");


            System.out.println("The values of marks are : ");

            for(int i =0;i<size;i++){
                  System.out.println("The value at " + i + " is " + marks[i]);
            }
  
            System.out.println("\n");



                 // finding the square of the elements of the array 4

                 System.out.println("Finding the square of the elemens of the array");
                 

                 for(int i = 0;i<size;i++){
                  System.out.println(marks[i]*marks[i]);
                 }
      }

      

 


      
}
