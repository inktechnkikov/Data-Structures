package StackAndQueues.LinkedListTask;


import org.junit.Assert;
import org.junit.Test;

public class LinkedListTests {
    @Test
    public void addFirstShouldIncreaseSize(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        Assert.assertEquals(1,list.getSize());
    }
    @Test
    public void addFirstShouldAddElement(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        for (Integer item : list) {
            Assert.assertEquals(Integer.valueOf(1),item);
        }
    }
    @Test
    public void addLastShouldAddElement(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        for (Integer item : list) {
            Assert.assertEquals(Integer.valueOf(1),item);
        }
    }

}
