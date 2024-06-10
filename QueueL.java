import java.util.*;
public class QueueL {
    static class node{
        int data;
        node next ;
        node(int data){
            this.data=data;
            this .next=null;
        }
   }
    static class Queue{
       static node head =null;
       static node tail =null ;
        public static boolean isEmpty(){
            return head == null && tail==null ;
        }
       
        // addition of element in the queue 
        public static void add( int data){
           node newNode =new node(data);
           if(head==null){
            head=tail=newNode;
            return;
           } 
           tail.next =newNode;
           tail=newNode;
        }
        // removing element from  the queue 
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty" );
                return -1;
            }
          int front =head.data;
          // singlr element 
          if(tail==head  ){
            head=tail = null;
          }else {
            head =head.next;
          }
          return front ;
        }
        // peek function 
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        System.out.println("introduction of queue");
        Queue q =new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
       
    }
}
