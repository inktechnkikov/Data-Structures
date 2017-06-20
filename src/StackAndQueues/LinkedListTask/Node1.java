package StackAndQueues.LinkedListTask;


public class Node1<T>{
    public T Value;
    public Node1 Next;

    public Node1(T Value){
        this.Value = Value;
    }

    public T getValue() {
        return this.Value;
    }

    public void setValue(T value) {
        this.Value = value;
    }

    public Node1 getNext() {
        return this.Next;
    }

    public void setNext(Node1 next) {
        this.Next = next;
    }
}
