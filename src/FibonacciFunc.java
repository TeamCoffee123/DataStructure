public class FibonacciFunc {
    static int Fibo(int num)
    {
        //System.out.println(num);
        if(num==1)
        {
            return 0;
        }

        else if(num==2)
        {
            return 1;
        }

        else
            return Fibo(num-1)+Fibo(num-2);
    }

    public static void main(String args[]){
        //Fibo(7);
        for(int i=1; i<10; i++)
        {
            System.out.println(Fibo(i));
        }
    }
}
