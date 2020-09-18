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
        return null;
    }

    @Override
    public boolean insert(Object object) {
        return false;
    }

    @Override
    public int size() {
        return 0;
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

}
