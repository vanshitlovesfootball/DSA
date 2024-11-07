class Node{
      int data;
      Node next;

      Node(int data){
            this.data=data;
            this.next = null;
      }
}

class Linkedlist{
      Node head;
      public void addFirst(int data){
            Node newNode = new Node(data);
            if(head==null){
                  head= newNode;

                        }
            newNode.next=head;
            head= newNode;
      }


      public void print(){
            Node currNode = head;
            while(currNode!=null){
                  System.out.print(currNode.data + " ->");
            }
            System.out.println("NULL");
      }



}








public class dsa_with_java_linkedList_inserting_at_given_position {

      public static void main(String[] args) {

            Linkedlist ll= new Linkedlist();
            ll.addFirst(9);
            
      }
      
}
