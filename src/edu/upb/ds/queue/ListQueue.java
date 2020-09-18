package edu.upb.ds.queue;

public class ListQueue implements QueueInterface{

    public int size;
    public ListNode top;
    public ListNode buttom;

    public ListQueue(){}

    public ListQueue(int size, ListNode top, ListNode buttom) {
        this.size = 0;
        this.top = top;
        this.buttom = buttom;
    }

    @Override
    public void clear() {
        top=buttom=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public Object extract() {
        if (!isEmpty()){
            top = top.next;
            size--;
        } else {
            return null;
        }
        return true;
    }

    @Override
    public boolean insert(Object object) {
        if (!isEmpty()) {
            top = buttom = new ListNode(object);
            size++;
            return true;
        }
        else {
            ListNode temp = new ListNode(object);
            buttom.next = temp;
            buttom = temp;
            size++;
            return true;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        return false;
    }

    @Override
    public void sort() {

    }

    @Override
    public void reverse() {

    }

    @Override
    public String toString() {
        return "ListQueue{" +
                "size=" + size +
                ", start=" + top +
                ", finish=" + buttom +
                '}';
    }
}
