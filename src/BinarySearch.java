public class BinarySearch {
    public static int BSearch(int ar[], int x) {
        int first = 0;
        int last = ar.length - 1;
        int middle;
        int opCount = 0;

        while (first <= last) {

            middle = (first + last) / 2;

            if (ar[middle] == x) {
                return middle;
            } else {
                if (x > ar[middle]) {
                    return middle + 1;
                } else {
                    return middle - 1;

                }
            }


        }
        System.out.println("비교연산횟수" + opCount);
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int result;

        result = BSearch(arr, x);

        if (result == -1) {
            System.out.println("실패");
        } else
            System.out.println("성공" + result);

    }
}
