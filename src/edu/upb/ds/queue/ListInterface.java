package edu.upb.ds.queue;

import java.util.Iterator;

public interface ListInterface {

    /*
    essential operations
    */

    public boolean isEmpty(); //OK

    public int getSize(); //Ok

    public void clear(); //Ok

    public Object getHead();//Ok

    public Object getTail();//Ok

    public Object get(int index);//Ok

    public Object search(Object object);

    public void add(Object object);//Ok

    public void addTail(Object object);//Ok

    public void addEnd(Object object);//Ok

    public boolean insert(ListNode node, Object object);

    public boolean insert(Object ob, Object object);

    public boolean insertHead(Object object);//OK

    public boolean insertTail(Object object);

    public boolean set(ListNode node, Object object);

    public boolean remove(ListNode position);//Ok

    public ListNode rec(ListNode node);

    /*
    expansion operations
     */

    public boolean contains(Object object);

    public boolean isEquals(Object object);

    public Iterator<ListNode> iterator();//Soso

    public Object[] toArray();

    public Object[] toArray(Object[] object);

    public Object getBeforeTo();

    public Object getBeforeTo(ListNode node);

    public Object getNextTo();

    public Object getNextTo(ListNode node);

    public List subList(ListNode from, ListNode to);

    public List sortList();
}
