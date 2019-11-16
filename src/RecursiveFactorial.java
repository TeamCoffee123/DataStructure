public class RecursiveFactorial {
    static int Factorial(int n) {
        if(n==0){
            return 1;
        }

        //else
            return n*Factorial(n-1);
    }

    public static void main(String[] args){
        System.out.println("1! ="+Factorial(1));
        System.out.println("2! ="+Factorial(2));
        System.out.println("3"+Factorial(3));
        System.out.println("4! ="+Factorial(4));
        System.out.println("7! ="+Factorial(7));

    }
}
