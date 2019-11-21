package circulatlinkedlistQ5_1;

public class CirculateLinkedList {
    private Node head;
    private Node tail;
    private int size=0;

    private class Node{
        private int data;
        private Node next;
        public Node(int inputData){
            this.data = inputData;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }


    public void addFirst(int inputData){
        Node newNode = new Node(inputData);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
        tail.next = head;
    }

    public void addLast(int inputData){
        Node newNode = new Node(inputData);
        if(size==0){
            addFirst(inputData);
        }
        else{
            tail.next = newNode;
            tail= newNode;
            newNode.next = head;
            size++;
        }

    }

    Node searchNode(int searchIndex){
        Node x = head;
        for(int i =0; i<searchIndex; i++){
            x=x.next;
        }
        return x;
    }

    public void addMiddle(int index, int inputData){
        if(index ==0){
            addFirst(inputData);
        }
        Node temp1 = searchNode(index-1);
        Node temp2 = temp1.next;
        Node newNode = new Node(inputData);

        temp1.next =  newNode;
        newNode.next = temp2;
        size++;
        if(newNode.next == head){
            tail=newNode;
        }

    }

    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str ="[";

        for(int i=0; i<=(size-1)*2; i++){
            str += temp.data+",";
            temp=temp.next;
        }
        str += temp.data;
        return str+"]";

    }






}
