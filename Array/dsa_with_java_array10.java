package dsa_with_java_arrays;

import java.util.*;

public class dsa_with_java_array10 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of rows of matrix");

            int rows = sc.nextInt();

            System.out.println("Enter the number of columns of matrix");

            int cols = sc.nextInt();

            int array[][] = new int[rows][cols];


            System.out.println("\n");

            System.out.println("Enter the elements of the matrix");

            for(int i =0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                        array[i][j] = sc.nextInt();
                        
                  }
            }

            System.out.println("\n");


            System.out.println("The elements of the array are :");

            for(int i=0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                        System.out.println(array[i][j]+ " ");
                  }
                  System.out.println();
            }

            System.out.println("Enter the element to be searched");

            int x = sc.nextInt();


            for(int i =0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                        if(array[i][j]==x){
                              System.out.println("x is present at location (" + i + " ," + j + " )");
                        }
                  }
            }

            
      }
      
}
