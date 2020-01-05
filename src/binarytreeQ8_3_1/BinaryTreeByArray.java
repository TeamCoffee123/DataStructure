package binarytreeQ8_3_1;

class BinaryTreeByArray {
    private int[] arr;
    private int lastUsedIndex;

    BinaryTreeByArray(int size){
        arr = new int[size+1];
        this.lastUsedIndex =0;
        System.out.println("Blank Tree of size " +size+ " has been created !");
    }

    private boolean isTreeFull(){
        return arr.length - 1 == lastUsedIndex;
    }


    void insert(int value){
        if(!isTreeFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Successfully inserted "+value+ " in the tree!");
        }

        else {
            System.out.println("Could not insert value in the Tree as it is full !");
        }
    }

    void levelOrder(){
        for(int i=1; i<lastUsedIndex; i++){
            System.out.println(arr[i]+" ");
        }
    }

    void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.println(arr[index]+" ");
        preOrder(index*2);
        preOrder(index*2+1);
    }


    private void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index*2);
        postOrder(index*2+1);
        System.out.println(arr[index]+ " ");
    }

    void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index*2);
        System.out.println(arr[index]+" ");
        inOrder(index*2+1);
    }

    int search(int value){
        for(int i=0; i<=lastUsedIndex; i++){
            if(arr[i] == value){
                System.out.println(value+" exists in the Tree!");
                System.out.println("It is at the location: " + i);
                return i;
            }
        }
        System.out.println(value+" does not exists in Tree!");
        System.out.println();
        return -1;
    }

    void delete(int value){
        int location = search(value);
        if(location == -1){
        }
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Successfully deleted " + value + " from the Tree !");
        }
    }

    void deleteTree(){
        try{
            arr = null;
            System.out.println("Tree has been deleted successfully !");
        }catch (Exception e){
            System.out.println("There was an error deleting the tree.");
        }
    }
}
