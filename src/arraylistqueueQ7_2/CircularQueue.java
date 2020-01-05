package arraylistqueueQ7_2;

public class CircularQueue {
    //private int front=0;
    //private int rear=0;
    //private int size = 0;
    //private int[] elementData = new int[5];

    private int front;
    private int rear;
    private int size;

    private int[] elementData;

    public CircularQueue(int size) {
        this.size = size;
        this.elementData = new int[this.size];
        this.front = this.rear = -1;
    }

    public void initializeStartOfArray() {
        if (front == -1) {
            front = 0;
        }
    }


    public void enQueue(int element) {
        if (isQueueFull()) {
            System.out.println("Queue overflow error");
        } else {
            initializeStartOfArray();
            if (rear + 1 == size) {
                rear = 0;
            } else {
                rear++;
            }
            elementData[rear] = element;
        }

    }


    public void deQueue() {
        if (isQueueEmpty())
            System.out.println("Queue underflow error");
        else {
            elementData[front] = 0;
            if (front == rear) {
                front = rear = -1; // have no elements currently in queue
            } else if (front + 1 == size) {
                front = 0;
            } else
                front++;
        }
    }

    public boolean isQueueEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }


    public boolean isQueueFull() {
        if (rear + 1 == front) {
            return true;
        } else if ((front == 0) && (rear + 1 == size)) {
            return true;
        } else
            return false;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
        System.out.println("front:" + front + ", rear:" + rear);
    }


}
