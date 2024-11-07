package dsa_with_java_arrays;
import java.util.*;

class Node{
      int data;
      Node next;

      Node(int data){
            this.data= data;
            this.next= null;
      }
}


class Linkedlist{
      Node head;

      public void add(int data){
            // if list is empty

            Node newNode = new Node(data);

            if(head==null){
                  System.out.println("The list is empty");
                  head = newNode;
            }

            else{
                  Node currentNode = head;

                  while(currentNode.next!=null){
                         currentNode = currentNode.next;
                  }
                  currentNode.next= newNode;
            }
      }

      public void displayResult(){

            Node current = head;

            while(current!=null){
                  System.out.print(current.data + " ");

                  current = current.next;
            }
            System.out.println();


      }

      public int findingthelengthofLinkedList(){
            int count = 0;

            Node curr = head;

            while(curr!=null){
                  count++;
                  curr = curr.next;
            }

              return count;



      }
}

public class dsa_with_java_arraytoLinkedlist {

   

     






      public static void main(String[] args) {

            int [] array = {1,2,4,3,5,6};

            System.out.println("The array is : "+Arrays.toString(array));
            Linkedlist ll = new Linkedlist();

            for(int num:array){
                  ll.add(num);
            }

            System.out.println("Linked list is : ");


            ll.displayResult();

            int length = ll.findingthelengthofLinkedList();
            System.out.println("The length is : "+length);



            
      }
      
}
