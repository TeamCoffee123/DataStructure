package binarytreeQ8_3;

public class BinaryTreeByLinkedListMain {
    public static void main(String[] args){
        BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();

        for(int i=0; i<=10; i++){
            tree.insert(i*10);
        }





        System.out.println("Level-order of tree");
        tree.levelOrder();
        System.out.println();

        System.out.println("Pre-order of tree");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("Post-order of tree");
        tree.postOrder(tree.root);
        System.out.println();

        System.out.println("In-order of tree");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("searching node 50 in the tree");
        tree.search(50);

        System.out.println("searching node 500 in the tree");
        tree.search(500);

        System.out.println("Deleting node having value-5 in the tree");
        tree.deleteNodeOfBinaryTree(5);

        System.out.println("Deleting node having value-50 in the tree");
        tree.deleteNodeOfBinaryTree(50);
        tree.levelOrder();

        System.out.println("Deleting node having value-10 in the tree");
        tree.deleteNodeOfBinaryTree(10);
        tree.levelOrder();

        System.out.println("Deleting node having value-80 in the tree");
        tree.deleteNodeOfBinaryTree(80);
        tree.levelOrder();

        System.out.println("Deleting the entire Tree");
        tree.deleteTree();
    }
}
