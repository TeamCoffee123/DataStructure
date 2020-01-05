package recursion;

public class HanoiTowerSolu {
   static void HanoiTowerMove(int num, char from, char by, char to)
    {
        if(num==1)
        {
            System.out.println("마지막 원반을 "+from+"에서 "+to+"으로 이동");
        }
        else
        {
            HanoiTowerMove(num-1,from,to,by);
            System.out.println(num+"원반을 "+from+"에서"+to+"으로 이동");
            HanoiTowerMove(num-1,by,from,to);
        }
    }


    public static void main(String args[])
    {

        HanoiTowerMove(4,'A','B','C');
    }
}
