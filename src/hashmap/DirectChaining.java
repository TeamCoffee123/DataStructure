package hashmap;


import java.util.LinkedList;

class DirectChaining {
    private LinkedList[] hashTable;
    //int maximumChainSize = 5;



    DirectChaining(){
        hashTable = new LinkedList[13];
    }

    private int simpleASCIIHashFunction(String inputValues, int tableLength){
        char[] ch;
        ch = inputValues.toCharArray();
        int i,sum;
        for(sum=0,i=0; i<inputValues.length(); i++){
            sum = sum + ch[i];
        }
        return sum%tableLength;
    }

    void insertKeyInHashTable(String value){
        int newIndex = simpleASCIIHashFunction(value,hashTable.length);
        if(hashTable[newIndex] == null){
            System.out.println("index: "+newIndex+" is empty. Creating a new LinkedList there...");
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(value);
            System.out.println("Successfully inserted "+"\""+value+"\""+"in location:"+newIndex);
        }
        else {
            System.out.println("\nIndex: "+newIndex+" is having sufficient space. Inserting there..");
            hashTable[newIndex].add(value);
            System.out.println("Successfully inserted"+"\""+value+"\""+"in location: "+newIndex);
            System.out.println();
        }
    }

    void searchKeyInHashTable(String stringToBeSearched){
        int newIndex = simpleASCIIHashFunction(stringToBeSearched, hashTable.length);
        if(hashTable[newIndex] != null && hashTable[newIndex].contains(stringToBeSearched)){
            System.out.println("\n"+"\""+stringToBeSearched+"\""+" found in HashTable at location: "+newIndex);
        }
        else {
            System.out.println("wn"+"\""+stringToBeSearched+"\""+" not found in HashTable");
        }
    }

    void deleteKeyFromHashTable(String stringToBeDeleted){
        int newIndex = simpleASCIIHashFunction(stringToBeDeleted,hashTable.length);
        if(hashTable[newIndex] != null && hashTable[newIndex].contains(stringToBeDeleted)){
            System.out.println("\n"+"\""+stringToBeDeleted+"\""+" has been found in HashTable.");
            hashTable[newIndex].remove(stringToBeDeleted);
            System.out.println("\""+stringToBeDeleted+"\""+"has been found in HashTable.");
        }
        else {
            System.out.println("\nCould not find "+"\""+stringToBeDeleted+"\""+"in HashTable");
        }
    }

    void displayHashTable(){
        if(hashTable == null){
            System.out.println("\nHashTable does not exits !");
        }
        else {
            System.out.println("\n--------HashTable----------");
            for(int i=0; i<hashTable.length; i++){
                System.out.println("Index: "+i+", key: "+hashTable[i]);
            }
        }
    }

    void deleteHashTable(){
        hashTable = null;
        System.out.println("Successfully deleted HashTable !");
    }

}
