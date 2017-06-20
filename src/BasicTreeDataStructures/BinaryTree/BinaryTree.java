package BasicTreeDataStructures.BinaryTree;


public class BinaryTree<T> {

    public T value;
    public BinaryTree<T> left;
    public BinaryTree<T> right;

    public BinaryTree(T value){
        this.value = value;
    }
    public BinaryTree(T value,BinaryTree<T> child){
        this.value = value;
        this.left = child;
    }
    public BinaryTree(T value,BinaryTree<T> leftChild,BinaryTree<T> rightChild){
        this.value = value;
        this.left = leftChild;
        this.right = rightChild;
    }
}
