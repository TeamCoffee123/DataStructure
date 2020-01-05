package hashmap;

public class LinearProbingMain {
    public static void main(String[] args){
        LinearProbing linearProbing = new LinearProbing();
        linearProbing.insertKeyInHashTable("The");
        linearProbing.insertKeyInHashTable("quick");
        linearProbing.insertKeyInHashTable("brown");
        linearProbing.insertKeyInHashTable("fox");
        linearProbing.insertKeyInHashTable("over");
        linearProbing.insertKeyInHashTable("lazy");
        linearProbing.deleteHashTable();

        linearProbing.insertKeyInHashTable("fox");
        linearProbing.deleteHashTable();
    }
}
