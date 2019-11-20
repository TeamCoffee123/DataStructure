package arraylistQ3_1;

public class ArrayListMulti {
    private int[] elementData = new int[10];
    private int size = 0;


    public boolean addLast(int element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean addMiddle(int index, int element) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst(int element) {

        return addMiddle(0, element);
    }


    public int elementList(int insertNumber) {
        for (int i = 0; i < insertNumber; i++) {
            addMiddle(i, i + 1);
        }
        return insertNumber;
    }

    public int sum(int addToLastNumber) {
        int sum = 0;
        for (int i = 0; i < addToLastNumber; i++) {
            sum += elementData[i];
        }
        return sum;
    }

    public int multiNumber(int removeMultiNumber) {
        int i = 0;
        while (i < size) {
            if (elementData[i] % removeMultiNumber == 0) {
                remove(i);
            }
            i++;

        }
        return removeMultiNumber;

    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i];
            if (i < size - 1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public int remove(int index) {
        int removed = elementData[index];
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        size--;
        return removed;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(size - 1);
    }

    public int get(int index) {

        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(int o) {
        for (int i = 0; i < size; i++) {
            if (o == elementData[i]) {
                return i;
            }
        }
        return -1;
    }

}
