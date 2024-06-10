import java.util.LinkedList;
import java.util.Queue;

public class two_halves {
    public static void intterLeave(Queue<Integer> q){
        Queue <Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        System.out.println("two halves");
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
        q.add(10);
        intterLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");

        }
        System.out.println();
    }
}
