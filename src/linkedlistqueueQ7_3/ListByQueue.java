package linkedlistqueueQ7_3;

import java.util.NoSuchElementException;

public class ListByQueue {
    private Node front;
    private Node rear;
    private int size;

    public ListByQueue() {
        this.front = null;
        this.rear = null;
    }

    public class Node {
        private int data;
        private Node next;

        public Node(int inputData) {
            this.data = inputData;
            this.next = null;
        }
    }

    public void enqueue(int inputData) {
        Node newNode = new Node(inputData);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        rear.next = front;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow error");
            return Integer.MIN_VALUE;
        }

        int value;

        if (front == rear) {
            value = front.data;
            front = null;
            rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.next;
            rear.next = front;
        }
        return value;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        }
        return false;
    }

    public void printLinkedList() {
        if (isEmpty()) {
            System.out.println("Queue underflow error");
        } else {
            Node temp = front;
            while (temp.next != front) {
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }


    }


}
