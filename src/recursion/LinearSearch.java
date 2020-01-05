package recursion;

public class LinearSearch {

   public static int LSearch(int[] ar, int x)
   {

       for(int i=0; i<ar.length; i++)
       {
           if(ar[i] == x)
           {
               return i;
           }

       }

       return -1;
   }

   public static void main(String args[])
   {
       int arr[] ={1,2,3,4,5,6,7};
       int x=3;

       int result = LSearch(arr,x);

       if(result==-1)
       {
           System.out.println("없다");
       }
       else
       {
           System.out.println("있다."+result);
           System.out.println(arr[result]);
       }
   }
}
