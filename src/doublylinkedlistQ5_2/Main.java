package doublylinkedlistQ5_2;

public class Main {
    public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(40);
        doublyLinkedList.addFirst(10);
        doublyLinkedList.addLast(50);
        doublyLinkedList.addLast(60);
        doublyLinkedList.addMiddle(1, 20);
        doublyLinkedList.addMiddle(2, 30);
        System.out.println(doublyLinkedList);


        doublyLinkedList.removeMiddle(1);
        doublyLinkedList.removeLast();
        System.out.println("1번째 인덱스와 마지막 인덱스 삭제: " + doublyLinkedList);
        System.out.println("0번째 인덱스 출력: " + doublyLinkedList.get(0) + ", Data가 40인 index 출력: " + doublyLinkedList.indexOf(40));
        System.out.println("노드 갯수: " + doublyLinkedList.size());

}
}
