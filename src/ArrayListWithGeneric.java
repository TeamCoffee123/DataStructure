import java.lang.reflect.Array;
import java.util.ArrayList;


public class ArrayListWithGeneric<T> {
    private T arr[]; // 리스트의 저장소인 배열
    private int numOfData;
    private int curPosition;
    private int size;

    public ArrayListWithGeneric(int size){
        arr=(T[]) Array.newInstance(Integer.class,size);
        this.size=size;
    }
    public void ListInit(){
        this.numOfData=0;
        this.curPosition=-1;
    }
    public void LInsert(T data){
        if(numOfData >=size){
            System.out.println("저장이 불가능 합니다.");
            return;
        }
        arr[numOfData]=data;
        numOfData++;
    }

    public boolean LFirst(){
        if(numOfData ==0)
            return false;
        curPosition=0;
        return true;
    }

    public T GetData(){

        return arr[curPosition];
    }

    public boolean LNext(){
        if(curPosition>=numOfData-1)
            return false;
        curPosition++;
        return  true;
    }
    public T LRemove(){
        int rpos=curPosition;
        int num=numOfData;
        T rdata=arr[rpos];
        for(int i=rpos;i<num-1; i++)
            arr[i]=arr[i+1];
        numOfData--;
        curPosition--;
        return rdata;
    }
    public int LCount(){
        return numOfData;
    }

    public static void main(String[] args){
        ArrayListWithGeneric<Integer> list  = new ArrayListWithGeneric(100);
        list.ListInit();

        list.LInsert(11);
        list.LInsert(22);
        list.LInsert(33);
        list.LInsert(44);
        list.LInsert(55);

        System.out.println("현재 저장된 데이터수:"+list.LCount());

        if(list.LFirst()){
            System.out.println(list.GetData()+" ");

            while(list.LNext()){
                System.out.println(list.GetData()+" ");
            }
        }
        System.out.println("");

        if(list.LFirst()){
            if(list.GetData() == 22)
                list.LRemove();
        }

        System.out.println("현재 저장된 데이터의 수: "+list.LCount());
        if(list.LFirst()){
            System.out.println(list.GetData()+" ");
            while(list.LNext()){
                System.out.println(list.GetData()+" ");
            }
        }


    }






}
