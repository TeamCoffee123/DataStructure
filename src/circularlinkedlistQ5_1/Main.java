package circularlinkedlistQ5_1;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addFirst(20);
        circularLinkedList.addFirst(10);

        circularLinkedList.addMiddle(2, 11);
        circularLinkedList.addMiddle(3, 22);

        circularLinkedList.addLast(111);
        circularLinkedList.addLast(222);

        System.out.println(circularLinkedList);


        circularLinkedList.removeFirst();
        System.out.println("맨앞 삭제:"+ circularLinkedList);
        circularLinkedList.removeMiddle(3);
        System.out.println("3번 인덱스 삭제: "+ circularLinkedList);


    }
}
