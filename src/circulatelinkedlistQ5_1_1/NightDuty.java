package circulatelinkedlistQ5_1_1;

public class NightDuty {
    private Node head;
    private Node tail;
    private int size = 0;
    private int date = 0;
    //private int inputEmpNum= 0;

    private class Node {
        private String empName;
        private int empNum;
        private Node next;


        public Node(String inputName, int inputEmpNum) {
            this.empName = inputName;
            this.empNum = inputEmpNum;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.empName);
        }
    }


    public void addFirst(String inputName, int inputEmpNum) {
        Node newNode = new Node(inputName, inputEmpNum);

        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
        tail.next = head;
    }

    public void addLast(String inputName, int inputEmpNum) {
        Node newNode = new Node(inputName, inputEmpNum);
        if (size == 0) {
            addFirst(inputName, inputEmpNum);
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
            size++;
        }

    }

    public int indexOf(String findName) {
        Node temp = head;
        int index = 0;
        while (temp.empName == findName) {
            temp = temp.next;
            index++;

            if (temp == null)
                return -1;
        }
        return index;
    }


    public String printShiftName(int index, int date) {
        Node temp = head;
        for (int i = 0; i <= index + date + 1; i++) {
            temp = temp.next;
        }
        String str = "사번: " + temp.empNum + "인 " + temp.empName + "가 " + date + "일 뒤에 당직을 섭니다.";
        return str;

    }


    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        if (size == 1) {
            return "[" + temp.empName + "," + temp.empNum + "]";
        }

        String str = "[";

        for (int i = 0; i < size - 1; i++) {
            str += temp.empName + ":" + temp.empNum + "/ ";
            temp = temp.next;
        }
        str += temp.empName + ":" + temp.empNum;
        return str + "]";

    }


}
