package arrayliststackQ6_2;


public class ArrayByStack {
    private int topIndex = -1;
    private int stackArr[] = new int[5];

    public void push(int inputData) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            topIndex++;
            stackArr[topIndex] = inputData;

        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Memory Error!");
        } else {
            stackArr[topIndex] = 0;
            topIndex--;
            //return topIndex
        }

    }

    public void peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(stackArr[topIndex]);
        }
    }


    public boolean isEmpty() {
        if (topIndex == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topIndex == stackArr.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        if (topIndex == -1) {
            return "Stack is empty!";
        }


        for (int i = stackArr.length - 1; i > -1; i--) {
            System.out.println(stackArr[i]);
        }
        return "==================================";
    }
}
