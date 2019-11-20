package linkedlistQ4_1;


public class LinkedList {
    private Node head;
    private Node tail;
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

    public void addFirst(int inputData) {
        Node newNode = new Node(inputData);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }

    }

    public void addLast(int inputData) {
        Node newNode = new Node(inputData);
        if (size == 0) {
            addFirst(inputData);
        } else {
            tail.next = newNode;
            //newNode = tail;
            tail = newNode;
            size++;
        }
    }

    Node searchNode(int searchIndex) {
        Node x = head;
        for (int i = 0; i < searchIndex; i++)
            x = x.next;
        return x;
    }


    public void addMiddle(int index, int inputData) {

        if (index == 0) {
            addFirst(inputData);
        } else {
            Node temp1 = searchNode(index - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(inputData);

            temp1.next = newNode;
            newNode.next = temp2;

            size++;

            if (newNode.next == null) {
                // newNode = tail;
                tail = newNode;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public int removeFirst() {
        Node temp = head;
        head = temp.next;
        int returnData = temp.data;
        size--;
        return returnData;
    }

    public int removeMiddle(int index) {
        if (index == 0)
            return removeFirst();
        Node temp = searchNode(index - 1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        int returnData = todoDeleted.data;
        if (todoDeleted == tail) {
            tail = temp;
        }

        size--;
        return returnData;
    }

    public int removeLast() {
        return removeMiddle(size - 1);
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        Node temp = searchNode(index);
        return temp.data;
    }

    public int indexOf(int data) {
        Node temp = head;
        int index = 0;
        while (temp.data != data) {
            temp = temp.next;
            index++;
            if (temp == null)
                return -1;
        }
        return index;
    }


}




