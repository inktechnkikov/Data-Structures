package StackAndQueues.LinkedListTask;

import java.util.Iterator;
public class LinkedList<E> implements Iterable<E>{

    private int size;
    private Node1 head;
    private Node1 tail;


    @Override
    public Iterator<E> iterator() {
       return null;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void addFirst(E item){
        Node1 oldHead = this.head;
        this.head = new Node1(item);
        this.head.setNext(oldHead);
        if(this.size == 0){
            this.tail = this.head;
        }
        this.size++;

    }
    public void addLast(E item){

        Node1 oldTail = this.tail;
        this.tail = new Node1(item);

      if(this.size == 0){
          this.head = this.tail;
      }else{
          oldTail.Next = this.tail;
      }
      this.size++;
    }
    public E removeFirst() {
        if (this.size == 0) {
            throw new UnsupportedOperationException();
        }
        Node1 oldHead = this.head;
        this.head = this.head.Next;
        this.size--;
        if(this.size == 0){
            this.tail = null;
        }
            return  null;
    }
    public E removeLast(){

        throw new UnsupportedOperationException();
    }
}
