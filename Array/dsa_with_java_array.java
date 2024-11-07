package dsa_with_java_arrays;
import java.util.Scanner;

public class dsa_with_java_array {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int [] marks = new int[4]; // memory reserved for 4 bytes of memory of space 

            marks[0]=89;
            marks[1]=78;
            marks[2]=89;
            marks[3]=90;

            for(int i =0;i<4;i++){
                   
                  System.out.println(marks[i]);
                  
  
            }
      }
      
}
