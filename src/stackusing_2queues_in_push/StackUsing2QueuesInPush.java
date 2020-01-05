package stackusing_2queues_in_push;


import java.util.*;

public class StackUsing2QueuesInPush {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    private int size;

    public StackUsing2QueuesInPush() {

        size = 0;
    }

    public void push(int data) {
        q2.add(data);
        size++;

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public void pop() {
        if (q1.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        size--;
        System.out.println(q1.remove());
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    public int size() {
        return size;
    }

}
