package dsa_with_java_arrays;










class Node{
      int data;
      Node next;

      Node(int data){
            this.data= data;
            this.next = null;
      }

}

class Linkedlistt{
      Node head;
      public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                  head = newNode;

                  return;

            }
            else{
                  newNode.next = head;
                  head = newNode;
            }
      }

      public void addLast(int data){
            Node newNode = new Node(data);

            if(head==null){
                  System.out.println("The list is empty");
            }
            else{
                  Node currentNode= head;
                  while(currentNode.next!=null){
                        currentNode = currentNode.next;
                  }
                  currentNode.next = newNode;
            }
      }

      public void deleteAtFirst(){
            if(head==null){
                  System.out.println("The list is empty there is nothing to delete");
                  return;
            }

            else{
                  head = head.next;
            }
            
      }

      public void deleteAtLast(){
            if(head==null){
                  System.out.println("The list is empty there is nothing to delete");
                  return;

            }
           else if(head.next==null){   // the list contains only 1 element here 
                  head=null;
            }

            else{
                  Node secNode = head;
                  Node lasNode= head.next;

                  while(lasNode.next!=null){

                        secNode=  secNode.next;
                        lasNode = lasNode.next;

                  }
                  secNode.next=null;
            }


      }

      public int lengthofLinkedlist(){

            int count=0;
            Node n= head;
            while(n!=null){
                  count++;
                  n = n.next;
            }
            return count;



      }

      

      public void print(){
            if(head==null){
                  System.out.println("The list is empty");
            }
            else{
                  Node currNode = head;

                  while(currNode!=null){
                        System.out.print(currNode.data + " ->");
                        currNode = currNode.next;
                  }
                  System.out.println("NULL");
            }
      }
}

public class dsa_with_java_linkedlist3 {
      public static void main(String[] args) {

            Linkedlistt ll = new Linkedlistt();
            ll.addFirst(6);
            ll.print();

            ll.addFirst(9);
            ll.print();

            ll.addFirst(5);
            ll.addFirst(0);
            ll.print();
            ll.addLast(10);
            ll.print();

              ll.addFirst(45);
            ll.print();


            int length = ll.lengthofLinkedlist();
            System.out.println("the length of linked list is : "+length);

            ll.deleteAtFirst();
            ll.print();
            System.out.println("the length of linked list is : "+length);

            ll.deleteAtLast();
            ll.print();

            

            
      }
      
}
