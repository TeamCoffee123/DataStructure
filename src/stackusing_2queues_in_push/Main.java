package stackusing_2queues_in_push;

public class Main {
    public static void main(String[] args) {
        StackUsing2QueuesInPush suqsa = new StackUsing2QueuesInPush();

        for(int i=1; i<6; i++){
            suqsa.push(i);
        }

        for(int i=0; i<5; i++){
            suqsa.pop();
        }




    }

}
