package BinaryTree;


import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void test(){
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(10);
        tree.add(85);
        tree.add(35);
        tree.add(60);

        tree.inOrderTraverse();

    }
}
