package dsa_with_java_arrays;

import java.util.Scanner;

public class dsa_with_java_array9 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of rows of matrix");

            int rows = sc.nextInt();

            System.out.println("Enter the number of columns of matrix");

            int cols = sc.nextInt();

            System.out.println("\n");

            int numbers[][] = new int[rows][cols];

            System.out.println("Enter the elements of 2-D matrix");


            for(int i =0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                      numbers[i][j] = sc.nextInt();
                  }
            }

            System.out.println("\n");


            System.out.println("The elements of the array are : ");

            for(int i =0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                        System.out.println(numbers[i][j]+ " ");
                  }

                  System.out.println();
            }
      }
      
}
