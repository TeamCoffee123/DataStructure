package stackusing_1queue_in_push;

public class Main {
    public static void main(String[] args){
        StackUsing1QueueInPush stackUsing1QueueInPush = new StackUsing1QueueInPush();

        for(int i=1; i<6; i++){
            stackUsing1QueueInPush.push(i);
        }
        System.out.println(stackUsing1QueueInPush.q1);

//        //stackUsing1QueueInPush.pop();
//       // stackUsing1QueueInPush.pop();
//        System.out.println(stackUsing1QueueInPush.q1);
//
//        stackUsing1QueueInPush.push(10);
//        stackUsing1QueueInPush.push(20);
//        System.out.println(stackUsing1QueueInPush.q1);

        for(int i=1; i<6; i++){
            stackUsing1QueueInPush.pop();
        }
    }

}
