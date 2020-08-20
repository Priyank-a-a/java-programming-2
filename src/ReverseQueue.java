//Q. 18 Reverse a queue


import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q)
    {
        //check if the queue is empty
        if(q.isEmpty())
        {
            return;
        }
        //if not empty follow below
        //saving the first element of q in the current variable
        int current = q.poll();
        reverse(q);
        q.add(current);

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        reverse(q);
        System.out.println(q);
    }
}
