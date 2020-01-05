package test;


import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String numbers ="100,200,300,400,500";
        StringTokenizer stringTokenizerComma = new StringTokenizer(numbers,",");

        while (stringTokenizerComma.hasMoreTokens()){
            System.out.println(stringTokenizerComma.nextToken());
        }

        String words = "가나 다라 마바 사아";
        StringTokenizer stringTokenizerSpacing = new StringTokenizer(words);

        while (stringTokenizerSpacing.hasMoreTokens()){
            System.out.println(stringTokenizerSpacing.nextToken());
        }

        String expression = "x=100*(200+300)/2";
        StringTokenizer stringTokenizerSign = new StringTokenizer(expression,"+-*/=()",true);

        while (stringTokenizerSign.hasMoreTokens()){
            System.out.println(stringTokenizerSign.nextToken());
        }
    }
}


