/*
class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
*/
public class LinkedList2 {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data); //head 생성
            //return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data == data) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

}
