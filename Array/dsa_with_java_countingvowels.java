package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_countingvowels {


      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string :");
            String str = sc.nextLine();
            //counting the number of vowels

            int count=0;

            // for(int i=0;i<str.length();i++){
            //        char ch = str.charAt(i);
            //        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            //             count++;
            //        }
                   
            // }

            // System.out.println("The number of vowels here is : "+count);

            for(int i=0;i<str.length();i++){
                       char ch = str.charAt(i);

                       if(ch==' '){
                        count++;
                       }

                       

            
      }
      System.out.println("The number of blank spaces here is : "+count);
      
}
}
