import java .util.*;
public class circularQueue {
    static class Queue{
        static  int arr[];
        static   int size;
        static int rear;
        static int front ;
        Queue(int n ){
            arr=new int[n];
            size =n;
            rear=-1;
            front =-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front ;
        }
        // addition of element in the queue 
        public static void add( int data){
            if (isFull()){
                System.out.println("queue is full");
                return ;
            }
            // when add first element 
            if (front ==-1){
                front =0;
            }
             rear =(rear +1)%size;
             arr[rear]=data;
        }
        // removing element from  the queue 
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty" );
                return -1;
            }
            int result =arr[front];
          
            // delete last el 
            if( rear ==front){
                rear =front =-1;
            } else {
                front =(front +1)% size ;
            }
            return result ;
        }
        // peek function 
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args){
        System.out.println("introduction of queue");
        Queue q =new Queue(5);
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