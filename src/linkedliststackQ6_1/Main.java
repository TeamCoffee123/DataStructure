package linkedliststackQ6_1;

public class Main {
    public static void main(String[] args) {
        LinkedByStack linkedByStack = new LinkedByStack();

        for(int i=1; i<6; i++){
            linkedByStack.push(i*10);
        }
        System.out.println(linkedByStack);
        linkedByStack.pop();
        System.out.println(linkedByStack);
        linkedByStack.peek();
    }
}
