package linkedlistQ4_1;


public class LinkedRead {
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

        if (head == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(int inputData) {
        Node newNode = new Node(inputData);
        if (size == 0) {
            addFirst(inputData);
        } else {
            tail.next = newNode;
            newNode = tail;
            size++;
        }
    }

    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }


    public void addMiddle(int k, int inputData) {

        if (size == 0) {
            addFirst(inputData);
        }
        else{
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(inputData);

            temp1.next = newNode;
            newNode.next=temp2;

            size++;

            if(newNode.next == null){
                newNode = tail;
            }
        }
    }

    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str="[";
        while (temp.next != null){
            str += temp.next+",";
            temp = temp.next;
        }
        str += temp.data;
        return str+"]";

    }

    public int removeFirst(){
        Node temp = head;
        head = temp.next;
        int returnData = temp.data;
        size--;
        return  returnData;
    }

    public int removeMiddle(int index){
        if(index==0){
            removeFirst();
        }
        Node temp = node(index-1);
        Node toDoDeleted = temp.next;
        temp.next = temp.next.next;
        int returnData = toDoDeleted.data;
        if(toDoDeleted == tail){
            tail = temp;
        }
        size--;
        return  returnData;
    }

    public int removeLast(){
        return removeMiddle(size-1);
    }

    public int size(){
        return size;
    }
    public int get(int index){
        Node temp = node(index);
        return temp.data;
    }

    public int indexOf(int data){
        Node temp = head;
        int index = 0;
        while(temp.data != data){
            temp=temp.next;
            index++;
            if(temp==null)
                return -1;
        }
        return index;
    }

}




