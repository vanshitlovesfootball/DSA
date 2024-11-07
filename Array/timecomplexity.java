package dsa_with_java_arrays;

import java.util.Scanner;

public class timecomplexity {

      public static void main(String[] args) {

            // int n;
            Scanner sc = new Scanner(System.in);
            //Here we are doing the time complexity 
            // we are finding the relation between the input size and the running time of operations


            // Let's see an example

            System.out.println("Hello we are doing the analysis of the time complexity");

            // In the above example the operation takes a constant time (or a very small amount of time to get executed)

            System.out.println("Hi good morning");
            System.out.println("We are chilling here");

            // in the above example the time taken to execute the two operations takes the double of the time taken to execute the previous one because there are two operations to get executed



            // So the running time of operation depends on the input size

            // consider this example


            for (int i = 0; i < n; i++) {

                  System.out.println("Value of i is : "+i);
                  
            }

            // here the time complexity depends on the input size
            // for each input the time complexity would be constant 
            // There are as such n inputs so the time complexity would be O(n)


      // We consider three cases for the time complexity 
      /* 
      1. Best Case  omega(1)
      2. Average case   theta(n)
      3. Worst Case   O(n)


      for example 

      int [] arr = {2,3,4,5,6}    
      
      We have to find 2 here 

      best case would be when it is present at the first position 

      average case when it is present at any place in the array

      worst case would be when it is present at the last index of array
      
      
      
      */    
      
      // Let's take another example 



      for(int i =0;i < n;i++){    // outer loop
            for(int j =0;j<n;j++){   // innerloop
                  System.out.println("Hi good morning");
            }
      }
      }

      //Here for every value of outer loop the inner loop will run for n times

      //There are as such n values of outer loop so the time complexity would be O(n*n)



      // Let's take another example 

      int n = sc.nextInt();

      int m = sc.nextInt();

      for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                  System.out.println("Hi we are learning dsa with java");
            }
      }


 // Here the inner loop will run for m number of times for every value of outer loop
 //There are as such m values for inner loop 
 // the time complexity is O(m*n);


//let's discuss space complexity  

// It is the space required by the variables declared inside the program to be resided in the memory
// Our aim should be to minimize the space required by the variables
//For example we have two input numbers 3 and 6 to be resided in the memory

//the question is which one would take more space
//The answer is that it is an integer number it would take 4 bytes of space in memory . the space is constant in the memory
// We should be discussing some of the data strcutures for efficient use of space here

// for example we have to take 8 integers for input   , We would be reserving 8 variables for these integers
// But we can use for array for these which will store the variables of same data type++
      
}
