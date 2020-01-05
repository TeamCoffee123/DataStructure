package test;

import java.util.Scanner;

public class Main_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommonMeasure commonMeasure = new CommonMeasure();


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(commonMeasure.gcd(num1, num2));
        System.out.println(commonMeasure.lcm(num1, num2));
    }

}


class CommonMeasure {
    int gcd(int num1, int num2) {
        while (num2 > 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }


    int lcm(int num1, int num2) {

        return (num1 * num2) / gcd(num1, num2);
    }
}
