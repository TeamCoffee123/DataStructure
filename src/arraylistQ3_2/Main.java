package arraylistQ3_2;

public class Main {
    public static void main(String[] args) {
        ArrayListNameCards nameCards = new ArrayListNameCards();

        nameCards.add("아이유", "1111-1111");
        nameCards.add("송하예", "2222-2222");
        nameCards.add("장범준", "3333-3333");
        nameCards.add("임재현", "4444-4444");
        nameCards.add("태연", "5555-5555");

        //리스트 출력
        System.out.println(" 리스트: " + nameCards);
        System.out.println();

        //특정이름 검색시 전화번호 출력
        System.out.println("이름 검색: " + nameCards.printPhoneInfo(nameCards.indexOf("루나")));
        System.out.println("이름 검색: " + nameCards.printPhoneInfo(nameCards.indexOf("태연")));
        System.out.println();

        //특정이름 검색후 전화번호 변경
        System.out.println("검색할 이름과 변경할 전화번호: " + nameCards.changePhoneInfo(nameCards.indexOf("아이유"), "999-9999"));
        System.out.println(nameCards);
        System.out.println();

        //특정이름 검색후 정보 삭제
        System.out.println("삭제할 이름: " + nameCards.remove(nameCards.indexOf("임재현")));
        System.out.println(nameCards);


    }
}
