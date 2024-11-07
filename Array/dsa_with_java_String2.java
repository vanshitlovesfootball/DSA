package dsa_with_java_arrays;
import java.util.*;

public class dsa_with_java_String2 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the string");
            String str = sc.next();

            String newString;
           

            // capitalizing the first letter of string

            if(str==null || str.isEmpty()){
                  newString=str;

            }

            else{
                newString= str.substring(0,1).toUpperCase()+str.substring(1);
            }


            System.out.println("The new string is : "+newString);





      }
      
}
