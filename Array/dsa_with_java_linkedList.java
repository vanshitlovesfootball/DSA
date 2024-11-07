package dsa_with_java_arrays;



public class dsa_with_java_linkedList {
      Node head;
      int size;

      dsa_with_java_linkedList(){
            this.size=0;
      }


      class Node{
            String data;

            Node next;


            Node(String data){   // Node class constructor
                  this.data= data;
                  this.next= null;  
                   //assuming that there is no next node in the linked list
                   size++;
            }


      }
            // Node head;

            public void addFirst(String data){
                  Node newNode = new Node(data);
                  if(head==null){    // if list is empty
                        head= newNode;    // now new node becomes the head
                        return;
                  }
                  newNode.next= head;  // points the new node to the current head
                  head = newNode;   // updates head to the new node
            }


            public void addLast(String data){
                  Node newNode = new Node(data);
                  if(head==null){   // if list is empty
                        head = newNode;    // The new node will become the head
                        return;
                  }
                  Node currentNode = head;

                  while(currentNode.next!= null){
                        currentNode = currentNode.next;
                  }

                  currentNode.next = newNode; 
            }


            
            public void deleteFirst(){
                  if(head==null){
                        System.out.println("The list is empty");

                        return;
                  }
                  size--;

                  head = head.next;
            }





            public void deleteLast(){
                  if(head==null){
                        System.out.println("The list is empty");
                        return;
                  }

                  size--;

                  if(head.next==null){       // it means that there in only 1 node in the list
                        head = null;
                        return;
                  }

                  Node secondLast= head;
                  Node lastNode=head.next;


                  // if(head.next==null){
                  //       head = null;
                  //       return;
                  // }



                  while(lastNode.next!=null){


                        lastNode= lastNode.next;
                        secondLast = secondLast.next;


                  }

                  secondLast.next= null;
            }

            public void addAtposition(int position ,String data){

                  Node newNode = new Node(data);
                  if(position==0){
                        newNode.next=head;
                        head=newNode;

                        return;

                  }

                  Node curr = head;
                  int count=0;

                  while (curr!=null && count<position-1) {

                        count++;
                        curr=curr.next;


                        
                  }

                  if(curr==null){
                        System.out.println("Position out of founds");
                        return;
                  }

                  //Updating the pointers

                  newNode.next=curr.next;
                  curr.next=newNode;

            }

            public void printList(){

                  if(head==null){
                        System.out.println("List is empty");
                        return;
                  }
                 Node currentNode = head;

                 while(currentNode!=null){   // if we write current.next!=null then it will not print the last node added
                  System.out.print(currentNode.data + " -> ");
                  currentNode = currentNode.next;
                 }
                 System.out.println("NULL");// after printing all the node data in the list it prints null to indicate the end of the list
                  
            }

            public int getSizeoflist(){
                  return size;
            }


            // public void deleteFirst(){
            //       if(head==null){
            //             System.out.println("The list is empty");

            //             return;
            //       }

            //       head = head.next;
            // }
      



      public static void main(String[] args) {


            dsa_with_java_linkedList ll = new dsa_with_java_linkedList(); // Making of the object of class   


            // ll.addFirst("Hi");

         ll.addFirst("ram");
         ll.addFirst("shree");
         ll.addFirst("jai");
         ll.printList();

       ll.addLast("har");
       ll.addLast("har");
       ll.addLast("mahadev ");

      ll.printList();

      ll.deleteFirst();
      ll.printList();


      ll.deleteLast();
      ll.printList(); 

      ll.addFirst("namaste");
      ll.printList();


      ll.deleteLast();

      ll.printList();

      System.out.println(ll.getSizeoflist());


      ll.addFirst("wo");
      ll.printList();


      // System.out.println(ll.getSizeoflist());


      










            
      }
      
}
