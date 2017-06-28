package BinaryTree;

public class BinaryTree{
    Node root;

    public void add(int data){
        Node nodeToAdd = new Node(data);
        if(root == null){
            root = nodeToAdd;
        }
            traverseAndAddNode(root,nodeToAdd);
    }
    public void traverseAndAddNode(Node node,Node nodeToAdd){
        if(nodeToAdd.data < node.data){
            if(node.leftChild == null){
                node.leftChild = nodeToAdd;
            }else{
                this.traverseAndAddNode(node.leftChild,nodeToAdd);
            }
        }else if(nodeToAdd.data > node.data){
            if(node.rightChild == null){
                node.rightChild = nodeToAdd;
            }else{
                this.traverseAndAddNode(node.rightChild,nodeToAdd);
            }

        }
    }
    public void traverse(){
        //in-order traversal
        if(root!=null){
            Node nodeToTravers = root;
            if(nodeToTravers.leftChild == null && nodeToTravers.rightChild == null){
                System.out.println(nodeToTravers.data);
            }
           else{
                if(nodeToTravers.leftChild !=null){
                    this.inOrderTraverse(nodeToTravers.leftChild);
                }if(nodeToTravers.rightChild != null){
                    this.inOrderTraverse(nodeToTravers.rightChild);
                }
            }
        }
    }
    public void inOrderTraverse(Node node){
        if(node.leftChild!=null){
            this.inOrderTraverse(node.leftChild);
        }
        System.out.println(node.data);
        if(node.rightChild!= null){
            this.inOrderTraverse(node.rightChild);
        }
       // System.out.println(node.data);
    }

}
