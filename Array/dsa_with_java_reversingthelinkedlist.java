

class Node{
      int data;
      Node next;

      Node(int data){
            this.data=data;
            this.next= null;
      }
}

class Linked_List{
      Node head;

      public void addDataAtFirst(int data){
            Node newNode = new Node(data);
            if(head==null){
                  head=newNode;

                  return;

            }

            else{
                  newNode.next=head;
                  head=newNode;
            }
      }

      public void  addDataAtLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                  head=newNode;

                  return;

            }

            else{
                  Node cuNode=head;
                  while(cuNode.next!=null){
                        cuNode=cuNode.next;
                  }
                  cuNode.next=newNode;
            }


            

      }

      public void deleteAtFirst(){

            if(head==null){
                  System.out.println("The list is empty");

                  return;
            }

            else{
                  head=head.next;
            }

      }
      public void deleteAtLast(){
            if(head==null){
                  System.out.println("The list is empty and there is nothing to delete here");
            }

            else if(head.next==null){
                  head = null;
            }

            else{
                  Node secNode=head;
                  Node lasNode= head.next;

                  while(lasNode.next!=null){
                        secNode=secNode.next;
                        lasNode=lasNode.next;
                  }
                  secNode.next=null;
            }
            
      }

      public void revereseLinkedList(){
            Node previous = null;
            Node current= head;
            Node next= null;

            while(current!=null){
                  next =current.next;

                  current.next= previous;

                  previous = current;
                  current = next;
            }
            head=previous;

      }

      public boolean isPalindrome(){
            if(head==null || head.next==null){  // This means that if a list contains a single element or an empty list then it is alsways palindrome
                  return true;

            }

            // here we do the middle of the linked list
            Node slow=head; // setting two pointers here 
            Node fast=head;

            while(fast!=null && fast.next!=null){  // when the slow reaches the middle the fast reaches the end of the list
                  slow= slow.next;
                  fast = fast.next.next;
            }

            // We will be comparing the first half with the second half
            
            Node secondHalfHead= reverse(slow);

            Node firstHalf= head;
            Node secondHalf = secondHalfHead;
            boolean isPalindrome=true;

            while (secondHalf!=null) {

                  if(firstHalf.data!=secondHalf.data){
                        isPalindrome = false;

                        break;

                  }
                  firstHalf= firstHalf.next;
                  secondHalf= secondHalf.next;

                  
            }

            reverse(secondHalfHead);

            return isPalindrome;
      }

      private Node reverse(Node head){
            Node pre= null;
            Node current = head;
            Node next = null;

            while(current!=null){
                  next = current.next;
                  current.next=pre;
                  pre= current;
                  current=next;
            }

            return pre;

      }




      public void printData(){
            Node currentNode = head;

            while(currentNode!=null){
                  System.out.print(currentNode.data + " ->");
                  currentNode= currentNode.next;
            }
            System.out.println("NULL");
      }

      public int length(){
            int count=0;
            Node c=head;
            while(c!=null){
                  count++;
                  c=c.next;

            }
            return count;

      }

     
      

}


public class dsa_with_java_reversingthelinkedlist {

      // class Node{
      //       int data;
      //       Node next;

      //       Node(int data){
      //             this.data=data;
      //             this.next= null;
      //       }
      // }

      // class Linked_List{
      //       Node head;

      //       public void addDataAtFirst(int data){
      //             Node newNode = new Node(data);
      //             if(head==null){
      //                   head=newNode;

      //                   return;

      //             }

      //             else{
      //                   newNode.next=head;
      //                   head=newNode;
      //             }
      //       }





      //       public void printData(){
      //             Node currentNode = head;

      //             while(currentNode!=null){
      //                   System.out.print(currentNode.data + " ->");
      //                   currentNode= currentNode.next;
      //             }
      //             System.out.println("NULL");
      //       }
            

      // }

      public static void main(String[] args) {

            Linked_List ll = new Linked_List();

            ll.addDataAtFirst(3);
            ll.printData();
            ll.addDataAtLast(6);
            ll.printData();
            ll.addDataAtFirst(4);
            ll.printData();
            ll.deleteAtFirst();
            ll.printData();
            ll.addDataAtFirst(6);
            ll.printData();
            ll.deleteAtLast();
            ll.printData();

            ll.addDataAtFirst(4);
            ll.printData();
            ll.deleteAtFirst();
            ll.printData();
            ll.addDataAtFirst(6);
            ll.printData();

            ll.addDataAtFirst(3);
            ll.printData();

            boolean final_Answer = ll.isPalindrome();

            System.out.println("Is the list palindrome : "+final_Answer);

           

            
      }
      
}
