package StackAndQueues;


public class Main {
    public static void main(String[] args) {
       Node<Integer> firstNode = new Node<>(10);
       Node<Integer> secondNode = new Node<>(20);
       Node<Integer> thirdNode = new Node<>(15);
       firstNode.setNextCell(secondNode);
       secondNode.setNextCell(thirdNode);
       Node<Integer> currentNode = firstNode;
       while (currentNode != null){
           System.out.println(currentNode.getValue());
           currentNode = currentNode.getNextCell();
       }
    }
}
