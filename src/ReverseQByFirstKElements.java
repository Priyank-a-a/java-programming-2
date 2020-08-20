//Q.19)Program to reverse first k elements of queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQByFirstKElements {
    public static Queue<Integer> reverseQueue(Queue<Integer> q, int k)
    {
        //using a stack for storing the removed elements of queue
        Stack<Integer> s =new Stack<Integer>();
        //k is the number of elements
        int temp=k;
        int size=q.size();
        while(--temp>=0)
        {
            s.push(q.remove());

        }
        while(!s.isEmpty())
        {
            //adding the elements from stack to queue
            q.add(s.pop());
        }
        temp=size-k;
        while(temp-->0)
        {
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        reverseQueue(q,2);
        System.out.println(q);
    }
}
