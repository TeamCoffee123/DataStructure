package circulatelinkedlistQ5_1_1;

public class Main {
    public static void main(String[] args) {
        NightDuty nightDuty = new NightDuty();


        nightDuty.addFirst("Johnny",222);
        nightDuty.addFirst("Sabrina",111);
        nightDuty.addLast("Grace",333);
        nightDuty.addLast("Jack",444);
        System.out.println("당직 루틴: "+nightDuty);

        //Grace 뒤로일 뒤 당직자는?
        System.out.println(nightDuty.printShiftName(nightDuty.indexOf("Grace"),15));
    }
}
