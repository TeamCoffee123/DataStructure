package test;


import java.util.ArrayList;

public class Main_1193 {
    public static void main(String argv[]) {
        int array[] = new int[10050];
        final int not_selfnumber = 1;
        final int selfnumber = 0;
        int i=0;

        while(i<=10000){
            int total=i;
            total+=decompose(i);
            array[total]=not_selfnumber;
            i++;
        }

        i=1;
        while(i<=10000) {
            int tmp = array[i];
            if(tmp == selfnumber)
                System.out.println(i+"");
            i++;
        }
    }

    public static int decompose(int num) {
        int total=0;
        while(num>=1) {
            total += (num%10);
            num/=10;
        }
        return total;
    }
}
