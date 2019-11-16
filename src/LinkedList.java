import org.w3c.dom.Node;

public class LinkedList {
    Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    ////////////////삽입 방법///////////////////
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int  new_data){
        if(prev_node == null){
            System.out.println("the given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }


    public void append(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;

        while(last.next != null)
            last=last.next;
        last.next = new_node;
        return;
    }

    ///////////프린트방법/////////////

    public void printList(){
        Node tnode = head;
        while (tnode != null){
            System.out.println(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    //////////////삭제방법/////////////////

    void deleteNode(int key){
        Node temp = head,prev = null;
       if(temp != null && temp.data ==key){
           head = temp.next;
           return;
       }
       while(temp != null && temp.data != key){
           prev = temp;
           temp = temp.next;
       }
       if(temp == null){
           return;
       }
       prev.next = temp.next;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(6);
        list.append(7);
        list.push(1);
        list.append(4);
        list.insertAfter(list.head.next,8);
        System.out.println("Created linked list is: ");
        list.printList();
    }

}
