package arraylistQ3_2;

public class ArrayListNameCards {
    private String[] name = new String[30];
    private String[] phoneNumber = new String[30];
    private int size =0;
    private int index;

    public ArrayListNameCards(String[] name,String[] phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String indexOf(String[] serchName){
       for(int i=0; i<size; i++){
           if(serchName[i] == name[index]){
               return phoneNumber[index];
           }

        }
         return serchName+"의 정보가 존재하지 않습니다.";
    }

    public int NameCompare(String[] insertName){
        if()
        return 1;

    }

}
