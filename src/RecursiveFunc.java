public class RecursiveFunc {
    public static void  Recursive (int num)
    {
        if(num<=0)
        {
            return;
        }


        System.out.println("재귀 진행중"+num);
        Recursive (num-1);
    }

    public static void main(String args[]){
        Recursive (3);
        return ;
    }
}
