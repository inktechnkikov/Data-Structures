package StackAndQueues;

public class Node<T>{
    private T value;
    private Node<T> nextCell;

public Node(T value){
    this.value = value;
}

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextCell() {
        return this.nextCell;
    }

    public void setNextCell(Node<T> nextCell) {
        this.nextCell = nextCell;
    }
}
