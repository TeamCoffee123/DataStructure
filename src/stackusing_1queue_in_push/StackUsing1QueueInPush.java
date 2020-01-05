package stackusing_1queue_in_push;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1QueueInPush {
    Queue<Integer> q1 = new LinkedList<>();

    public void push(int data){
       // System.out.println("1 push q1 list: ");
        q1.add(data);
        int size = q1.size();
       // System.out.println("2 push q1 list: "+q1+"q1 size: "+size);
        while (size>1){
          //  System.out.println("3 push q1 list: "+q1+"q1 size: "+size);
            q1.add(q1.remove());
          //  System.out.println("4 push q1 list: "+q1+"q1 size: "+size);
            size--;
          //  System.out.println("5 push q1 list: "+q1+"q1 size: "+size);
        }
    }

    public void pop(){
        if(q1.isEmpty())
           System.out.println("No element present");
        else
          //  System.out.println("6 push q1 list: "+q1+"q1 size: "+q1.size());
            System.out.println(q1.poll());
        //System.out.println("7 push q1 list: "+q1+"q1 size: "+q1.size());

    }
}
