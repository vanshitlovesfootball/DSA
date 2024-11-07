package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_Strings {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");

            String str = sc.next();
            // reversing the string

            String reversedString="";

            for(int i = str.length()-1;i>=0;i--){
                  reversedString+= str.charAt(i);

            }
            System.out.println("The reversed string is : "+reversedString);


            if(reversedString.equals(str)){
                  System.out.println("The string is a palindrome");
            }
            else{
                  System.out.println("Not a palindrome");
            }
      }
}
