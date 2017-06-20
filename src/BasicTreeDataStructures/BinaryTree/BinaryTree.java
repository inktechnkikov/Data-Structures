package BasicTreeDataStructures.BinaryTree;


import java.util.function.Consumer;

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
    public String printIndentPreOrder(int ident,StringBuilder builder){
        builder.append(new String(new char[ident]).replace("\0", " ")).append(this.value + "\n");
        if(this.left!=null){
            builder.append(this.left.printIndentPreOrder(ident+1,new StringBuilder()));
        }
        if(this.right!=null){
            builder.append(this.right.printIndentPreOrder(ident+1,new StringBuilder()));
        }
        return builder.toString();
    }
    public void eachInOrder(Consumer<T> consumer){
        if(this.left!=null){
            this.left.eachInOrder(consumer);
        }
        consumer.accept(this.value);
        if(this.right!=null){
            this.right.eachInOrder(consumer);
        }
    }
    public void eachPostOrder(Consumer<T> consumer){
        if(this.left!=null){
            this.left.eachPostOrder(consumer);
        }
        if(this.right!=null){
            this.right.eachPostOrder(consumer);
        }
        consumer.accept(this.value);
    }
}
