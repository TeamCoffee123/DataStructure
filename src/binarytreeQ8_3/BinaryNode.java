package binarytreeQ8_3;

public class BinaryNode {
    private int value;

    private BinaryNode left;
    private BinaryNode right;

    BinaryNode(int value) {
        this.value = value;
    }

    int getValue()
    {
        return value;
    }

    void setValue(int value){

        this.value = value;
    }

    BinaryNode getLeft(){

        return left;
    }

    void setLeft(BinaryNode left){

        this.left = left;
    }

    BinaryNode getRight(){
        return right;
    }

    void setRight(BinaryNode right)
    {
        this.right = right;
    }
    
    public String toString(){

        return value + "";
    }



}
