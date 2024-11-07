package dsa_with_java_arrays;

public class dsa_with_java_linked_list {

      Node head;

     class Node{
      int data;
      Node next;

    

      Node(int data){


            this.data=data;

            this.next= null;



}
     }

public void addFirst(int data){
      Node newNode = new Node(data);


      if(head ==  null){
          head = newNode;  // if list is empty

            return;


      }

      newNode.next = head;
      head = newNode;
}

public void addLast(int data){
      Node newNode= new Node(data);
      if(head == null){
            head = newNode;
            return;
      }

      Node currentNode = head;

      while(currentNode.next!=null){
            currentNode = currentNode.next;
      }
      currentNode.next= newNode;
}

public void deleteFirst(){
      if(head==null){
            System.out.println("The list is empty");
            return;
      }


      head = head.next;
}

public void deleteLast(){

      if(head == null){
            System.out.println("The   list is empty");

            return;
      }

      if(head.next==null)        // in this case the list contains a single node
{

      head = null;
      
      
}

Node secondLastNode = head;
Node lastNode = head.next;


while (lastNode.next!=null) {

      secondLastNode= secondLastNode.next;
      lastNode= lastNode.next;


      
}
       secondLastNode.next= null;
}

// Now let's add the element in the position between the list


public void addAtposition(int data, int position){

      if(position==1){
            addFirst(data);// it is the same as adding in the beginning of the list
            return;
      }


      Node newNode = new Node(data);
      Node currentNode = head;

      for(int i =1;i<position-1;i++){
            if(currentNode==null){
                  System.out.println("Position out of bounds");
                   return;  //The return statement is used to stop the method from running further when it encounters an invalid scenario

                               // Otherwise it will give errors. like NullpointerException
            }

            currentNode = currentNode.next;
      }

      if(currentNode==null){
            System.out.println("Position out of bounds");
            return;
      }

      newNode.next= currentNode.next;
      currentNode.next= newNode;

}


public void deleteAtposition(int position){


      if(head==null){
            System.out.println("The list is empty there is nothing to delete");
            return;
      }
      if(position==1){
            deleteFirst();  // same as deleting the node form the position 1 of the linked list
            return;
      }

      Node currentNode = head;


      for(int i=1;i<position-1;i++){
            if(currentNode==null || currentNode.next==null){
                  System.out.println("Position out of bounds");
                  return;

            }
            currentNode=currentNode.next;
      }

      if(currentNode.next==null){
            System.out.println("Position out of bounds");
            return;
      }




      currentNode.next=currentNode.next.next;


}

public void reverseList(){


      if(head==null || head.next==null){  // head is null means that there is a single node in the list
   
            return;                         // head.next is null means that there is only one node in the list

      }
      Node previousNode= head;
      Node currentNode = head.next;

      while(currentNode!=null){
            Node nextNode = currentNode.next;

            currentNode.next = previousNode;



            //update

            previousNode = currentNode;
            currentNode= nextNode;

            
      
      }
      head.next= null;
      head= previousNode;
}

public void printNode(){

      if(head==null){
            System.out.println("The list is empty");
            return;
      }

      Node currentNode = head;
      while(currentNode!=null){
            System.out.print(currentNode.data + " -> ");
            currentNode= currentNode.next;
      }
      System.out.println("null");



}






     


      public static void main(String[] args) {

           
            dsa_with_java_linked_list ll = new dsa_with_java_linked_list();
            ll.addFirst(7);
            ll.addFirst(9);
            ll.addFirst(0);
            // System.out.println(ll.printNode());
            ll.printNode();

            ll.deleteFirst();

            ll.printNode();

            ll.deleteLast();
            ll.printNode();

            ll.deleteFirst();
            ll.printNode();

            ll.addFirst(56);

            ll.addFirst(45);
            ll.addFirst(47);
            ll.printNode();  //  47 -> 45 -> 56 -> null

            ll.addAtposition(2, 2);
   
            ll.printNode();   // the output would be   47 -> 2 -> 45 -> 56 -> null

            ll.addAtposition(34, 1);
            ll.printNode();
            ll.addAtposition(90, 5);

            ll.printNode(); 
            // 34 -> 47 -> 2 -> 45 -> 90 -> 56 -> null


            // ll.reverseList();
            // ll.printNode();


            ll.deleteAtposition(4);

            ll.printNode();

            ll.deleteAtposition(1);
            ll.printNode();









            
      }
      
}
