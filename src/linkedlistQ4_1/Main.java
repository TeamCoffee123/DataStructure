package linkedlistQ4_1;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(40);
        linkedList.addFirst(10);
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addMiddle(1, 20);
        linkedList.addMiddle(2, 30);
        System.out.println(linkedList);


        linkedList.removeMiddle(1);
        linkedList.removeLast();
        System.out.println("1번째 인덱스와 마지막 인덱스 삭제: " + linkedList);
        System.out.println("0번째 인덱스 출력: " + linkedList.get(0) + ", Data가 40인 index 출력: " + linkedList.indexOf(40));
        System.out.println("노드 갯수: " + linkedList.size());

    }
}
