
import java.util.Scanner;


public class dsa_with_java_two_sum_problem {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of array");

            int size = sc.nextInt();

            System.out.println("\n");

            int [] nums = new int[size];

            System.out.println("Enter the elements of array");

            for(int i =0;i<nums.length;i++){
                  nums[i] = sc.nextInt();
            }

            System.out.println("The elements of the array are : ");

            for(int i =0;i<nums.length;i++){
                  System.out.print(nums[i] + " ");
            }

            System.out.println("\n");
            
            System.out.println("Enter the target sum to be calculated");

            int target = sc.nextInt();

            int result [] = twoSum_problem(nums, target);

            if(result.length==2){
                  System.out.println("The indices are found at : "+ result[0] + "  and " + result[1]);
            }

            else{
                  System.out.println("No such indices possible that add up to the target variable");
            }
            }


      public static int[] twoSum_problem(int[] nums , int target){

            for(int i =0;i<nums.length-1;i++){
                  for(int j =i+1;j<nums.length;j++){
                        if(nums[i]+nums[j]==target){
                              return new int[] {i,j};
                        }
                     
                  }
            }
            return new int[0];   // return an empty array

      }
      
      
}
