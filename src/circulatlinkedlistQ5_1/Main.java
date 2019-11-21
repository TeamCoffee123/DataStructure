package circulatlinkedlistQ5_1;

public class Main {
    public static void main(String[] args) {
        CirculateLinkedList circulateLinkedList = new CirculateLinkedList();
        circulateLinkedList.addFirst(20);
        circulateLinkedList.addFirst(10);

        circulateLinkedList.addMiddle(2, 11);
        circulateLinkedList.addMiddle(3, 22);

        circulateLinkedList.addLast(111);
        circulateLinkedList.addLast(222);

        System.out.println(circulateLinkedList);


        circulateLinkedList.removeFirst();
        System.out.println("맨앞 삭제:"+circulateLinkedList);
        circulateLinkedList.removeMiddle(3);
        System.out.println("3번 인덱스 삭제: "+circulateLinkedList);


    }
}
