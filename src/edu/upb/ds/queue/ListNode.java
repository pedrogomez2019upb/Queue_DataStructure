package edu.upb.ds.queue;

public class ListNode {
    public Object object;
    public ListNode next;
    public ListNode prev;
    public int priority;

    public ListNode(Object object)
    {
        this.object = object;
        this.next = next;
    }
    public ListNode(){}

    public ListNode(Object object, ListNode next) {
        this.object = object;
        this.next = next;
    }
    public ListNode(Object object,int priority) {
        this.object = object;
        this.priority=priority;
    }

    public Object getObject()
    {
        return object;
    }

    public void setObject(Object object)
    {
        this.object = object;
    }

    public void linkNext(ListNode n)
    {
        next=n;
    }
    public ListNode getNext()
    {
        return next;
    }

    public void setNext(ListNode next)
    {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return String.valueOf(object);
        /*
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';

         */
    }
}
