package linkedliststackQ6_1;


public class LinkedByStack {
    private Node head = null;
    private int size = 0;


    private class Node {
        private int data;
        private Node next;

        public Node(int inputData) {
            this.data = inputData;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }


    public void push(int inputData) {
        Node newNode = new Node(inputData);
        newNode.next = head;
        head = newNode;
        size++;

    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Memory Error!");
        }
        Node temp = head;
        head = temp.next;
        int returnData = temp.data;
        size--;
        return returnData;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("peek :" + head.data);
            return head.data;
        }
    }

    public String toString() {

        Node temp = head;

        if (head == null) {
            return "Stack is empty!";
        }


        for (int i = size; i > 0; i--) {

            System.out.println(temp.data);
            temp = temp.next;
        }
        return "==================================";
    }


}
