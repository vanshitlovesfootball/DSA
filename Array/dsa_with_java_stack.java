
// implementing the stack using linked list


package dsa_with_java_arrays;

public class dsa_with_java_stack {

      static class Node{
            int data;
            Node next;

            Node(int data){
                  this.data= data;
                  this.next= null;
            }
      }

      static class Stack{
            public static Node head;  // this is the top of the stack

            public static boolean isEmpty(){
                  return head == null;
            }

            public static void pushData(int data){

                  Node newNode = new Node(data);

                  if(isEmpty()){
                        head =newNode;
                        return;
                  }

                  newNode.next = head;
                  head = newNode;

            }

            public static int  pop(){   // in java the pop operation return the popped element
                  if(isEmpty()){
                        return -1;
                  }
                  int top = head.data;
                  head = head.next;
                  return top;
            } 

            public static int peek(){
                  if(isEmpty()){
                       return -1;
                  }

                  return head.data;
            }
      }























      public static void main(String[] args) {

            Stack s = new Stack();


            s.pushData(7);
            s.pushData(6);
            s.pushData(90);

            // while(!s.isEmpty()){
            //       System.out.println(s.peek());
            //       s.pop();
            // }

            System.out.println(s.peek());
           System.out.println(s.pop());

           System.out.println(s.peek());
           System.out.println(s.pop());

           System.out.println(s.peek());
           System.out.println(s.pop());


      //      System.out.println(s.peek());

      s.peek();




            // System.out.println(s.peek());/   // this shows that the stack is empty         
      }
      
}
