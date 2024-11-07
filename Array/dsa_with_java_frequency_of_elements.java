package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_frequency_of_elements {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size = sc.nextInt();

            System.out.println("\n");

            int [] array4 = new int[size];
            System.out.println("Enter the elements of the array");

            for(int i=0;i<size;i++){
                  array4[i] = sc.nextInt();
            }


         

            System.out.println("The elements of the array are : ");

            for(int i =0;i<size;i++){
                  System.out.println(array4[i]);
            }

            // finding the occurence of every element in the array

            findingOcurrencesofArray(array4);
      }
      public static void findingOcurrencesofArray(int [] array4){
            int length = array4.length;
             
            boolean[] counted = new boolean[length];  // an array named counted of same length as the array4 containing initially all false values

            System.out.println("Checking for the occurences of the elements : ");

            for(int i =0;i<length;i++){
                  if(counted[i]){
                        continue;
                  }

                  int count =1;

                  for(int j=i+1;j<length;j++){
                        if(array4[i]==array4[j]){
                              count++;
                              counted[j]= true;
                        }
                  }
                  System.out.println("The frequency of " +  array4[i] + " is " + count);
            }
      }
}
