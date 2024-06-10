import java.util.*;

public class Reversequeue {
    public static void reverse (Queue<Integer> q){
        Stack<Integer> s =new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        System.out.println("reverse of queue using stack");
         Queue <Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" , ");
        }
        System.out.println();
    }
}
