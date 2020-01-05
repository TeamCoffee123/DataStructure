package stackusing_2queues_in_pop;

import java.util.LinkedList;
import java.util.Queue;


public class StackUsing2QueuesInPop {
    Queue<Integer> q1;
    Queue<Integer> q2;

    int top;


    public StackUsing2QueuesInPop() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();

    }


    public void push(int data) {
        q1.add(data);
        top = data;
    }


    public int pop() {

        while(!q1.isEmpty()) {
            int t = q1.poll();
            if(q1.size()==1) {
                top = t;
            }
            if(q1.size()==0) {
                Queue<Integer> temp = q1;
                q1 = q2;
                q2 = temp;
                System.out.println(t);
                return t;
            }
            q2.add(t);

        }
        return -1;
    }


    public int top() {

        return top;
    }


    public boolean empty() {

        return (q1.size()==0);
    }


}
