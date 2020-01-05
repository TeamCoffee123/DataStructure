package linkedlistqueueQ7_3;

public class Main {
    public static void main(String args[]) {
        ListByQueue listByQueue = new ListByQueue();
        listByQueue.enqueue(10);
        listByQueue.enqueue(20);
        listByQueue.enqueue(30);
        listByQueue.printLinkedList();
        listByQueue.enqueue(40);
        listByQueue.printLinkedList();
        listByQueue.dequeue();
        listByQueue.printLinkedList();
        listByQueue.dequeue();
        listByQueue.dequeue();
        listByQueue.dequeue();
        listByQueue.printLinkedList();

    }
}