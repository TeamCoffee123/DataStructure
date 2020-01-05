package arrayliststackQ6_2;

public class Main {
    public static void main(String[] args) {
        ArrayByStack arrayByStack = new ArrayByStack();

        //push
        for (int i = 1; i < 6; i++) {
            arrayByStack.push(i);
        }
        System.out.println(arrayByStack);

        //push : stack full
        arrayByStack.push(6);
        System.out.println(arrayByStack);

        System.out.print("peek: ");
        arrayByStack.peek();

        //pop
        for (int i = 0; i < 4; i++) {
            arrayByStack.pop();
        }
        System.out.println(arrayByStack);


    }
}
