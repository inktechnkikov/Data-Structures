package BasicTreeDataStructures.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(5,
                                        new BinaryTree<>(2,
                                        new BinaryTree<>(1)));
        System.out.println(binaryTree.printIndentPreOrder(0, new StringBuilder()));
        System.out.println();
        binaryTree.eachInOrder(e-> System.out.println(e + " "));
        System.out.println();
        binaryTree.eachPostOrder(s -> System.out.println(s + " "));
    }
}
