package arraylistQ3_1;

public class Main {
    public static void main(String[] args) {
        ArrayListMulti numbers = new ArrayListMulti();


        System.out.println("1~9까지의 리스트 일 경우 "+numbers.elementList(9));
        System.out.println("처음 List 입력값: "+numbers);
        System.out.println("List의 element 합: "+numbers.sum(numbers.size()));
        System.out.println(numbers.multiNumber(2)+"의 배수와 "+numbers.multiNumber(3)+"의 배수 삭제");

        System.out.println("연산 후 List의 값: "+numbers);

    }

}
