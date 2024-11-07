import java.util.Scanner;



public class dsa_with_java_havingsubarraymaximumsum {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size");
            int size = sc.nextInt();

            System.out.println("\n");

            System.out.println("Enter the elements of the array");

            int [] array = new int[size];

            for(int i =0;i<size;i++){
                  array[i] = sc.nextInt();
            }

            System.out.println("The array is : ");

            for(int i =0;i<size;i++){
                  System.out.print(array[i] + " ");
            }

System.out.println("\n");

            // let us find out the maximum sum from the subarrays formed from this array

            // int maxSum = Integer.MIN_VALUE;

            
            int count =0;
            int numberofSubarrays=0;

            System.out.println("The subarrays are : ");

            for(int i=0;i<size;i++){
                  int currentSum =0;


                  for(int j=i;j<size;j++){
                        currentSum+=array[j];
                        numberofSubarrays++;

                        // printing the subarrays

                        for(int k=i;k<=j;k++){
                              System.out.println(array[k] + " ");
                        }

                        if(currentSum%2==0){
                              count++;

                        }

                     
                  }
                
            }
            System.out.println("The number of subarrays having even sum is : "+count);
            
            System.out.println("The number of subarrays : "+numberofSubarrays);
            
      }
      
}
