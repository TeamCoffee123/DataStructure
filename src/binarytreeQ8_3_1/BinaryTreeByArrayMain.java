package binarytreeQ8_3_1;

public class BinaryTreeByArrayMain {
    public static void main(String[] args){
        System.out.println("Creating a blank Array to store Binary Tree...");
        BinaryTreeByArray arrayTree = new BinaryTreeByArray(10);

        System.out.println("Inserting 10 values in the Tree...");
        for(int i =1; i<=10; i++){
            arrayTree.insert(i*10);
        }

        System.out.println("Level-order Traversal: ");
        arrayTree.levelOrder();

        System.out.println("Pre-order Traversal: ");
        arrayTree.preOrder(1);

        System.out.println("Post-order Traversal: ");
        arrayTree.preOrder(1);

        System.out.println("In-order Traversal: ");
        arrayTree.inOrder(1);

        System.out.println("Searching value 500 in the tree..");
        arrayTree.search(500);

        System.out.println("Searching value 40 in the tree...");
        arrayTree.search(40);

        System.out.println("Deleting node 500 from the tree...");
        arrayTree.delete(500);

        System.out.println("Deleting node 40 from the tree...");
        arrayTree.delete(40);

        System.out.println("Level-order Traversal: ");
        arrayTree.levelOrder();

        System.out.println("Deleting the entire Tree...");
        arrayTree.deleteTree();
    }
}
