package edu.upb.ds.queue;

import java.util.Iterator;

public class List implements ListInterface{

    public ListNode head;
    public ListNode tail;
    public ListNode inode;
    public int size;

    public List() {
        head = null;
        tail = null;
        size = 0;

    }

    public List(Object object){
        head= new ListNode(object);
        tail =head;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void clear() {
        head=null;
        tail=null;
        size=0;
    }

    @Override
    public Object getHead()
    {
        int counter=0;
        ListNode temporalNode=head;
        while (counter<0)
        {
            temporalNode=temporalNode.getNext();
        }
        return temporalNode.getObject();
    }

    @Override
    public Object getTail() {
        Object temporalNode=tail.getObject();
        return temporalNode;
    }

    @Override
    public Object get(int index) {
        int counter=0;
        ListNode temporalNode=head;
        while (counter<index){
            temporalNode=temporalNode.getNext();
            counter++;
        }
        return temporalNode.getObject();
    }

    @Override
    public Object search(Object object) {
        Iterator<ListNode> i = this.iterator();
        ListNode inode;
        while (i.hasNext()) {

            inode = i.next();
            if (inode.getObject().toString().equals(object.toString())) {
                return inode;
            }
        }
        return null;
    }

    @Override
    public void add(Object object)
    {
        if(!isEmpty()){
            tail.next=new ListNode(object);
            tail=tail.next;
        }else {
            head=tail=new ListNode(object);
        }
        size++;
        /*
        if(head==null){
            head = new ListNode(object);
            tail = head;
        }
        else
        {
            ListNode temporalNode=head;
            ListNode newNode=new ListNode(object);
            newNode.linkNext(temporalNode);
            head=newNode;
        }
        size ++;
         */
    }

    @Override
    public void addTail(Object object) {
        if(tail==null){
            tail = new ListNode(object);
            head = tail;
        }
        else
        {
            ListNode temporalNode=tail;
            ListNode newNode=new ListNode(object);
            newNode.linkNext(temporalNode);
            tail=newNode;
        }
        size ++;
    }

    @Override
    public void addEnd(Object object)
    {
        if(!isEmpty()){
            tail.next=new ListNode(object);
            tail=tail.next;
        }else {
            head=tail=new ListNode(object);
        }
        size++;
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        try {
            if (ob != null) {
                ListNode inode = (ListNode) this.search(ob);
                if (inode.next == null) {
                    add(object);
                } else {
                    ListNode newNode = new ListNode(object);
                    newNode.next = inode.next;
                    inode.next = newNode;
                    size++;
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertHead(Object object) {
        if (isEmpty()) {
            head = new ListNode(object);
            tail = head;
            size++;
        } else {
            ListNode node = new ListNode(object);
            node.next = head;
            head = node;
            size++;
        }
        return true;
    }

    @Override
    public boolean insertTail(Object object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
                size++;
            } else {
                tail.next = new ListNode(object);
                tail = tail.next;
                size++;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean set(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean remove(ListNode node)
    {
        ListNode temporalNode = head;
        ListNode actualNode = head;
        if (actualNode == node) {
            head = actualNode.next;
            size--;

        } else {
            while (actualNode.next != null) {

                if (actualNode == node) {
                    break;
                }
                temporalNode = actualNode;
                actualNode = actualNode.next;
            }

            tail = temporalNode;
            tail.next = actualNode.next;
            size--;

        }
        return true;
    }


    @Override
    public boolean contains(Object object) {
        ListNode temporalNode = head;
        boolean result = false;
        while (temporalNode.next != null) {
            temporalNode = temporalNode.next;
            if (temporalNode == object) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean isEquals(Object object) {
        ListNode temporalNode = head;
        while (temporalNode.next != null) {
            if (temporalNode.getObject().toString().equals(object.toString())) {
                return true;
            }
            temporalNode = temporalNode.next;
        }
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        inode = head;
        Iterator<ListNode> i = new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return inode.next != null ? true : false;
            }

            @Override
            public ListNode next() {
                if (hasNext()) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
        return i;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray= new Object[size];
        ListNode temporalNode= head;
        for (int i=0; i<size; i++){
            newArray[i]=temporalNode;
            temporalNode= temporalNode.next;
        }
        return newArray;
    }

    @Override
    public Object[] toArray(Object[] object) {
        ListNode node = head;
        int sizeArray = object.length;
        int x = 0;
        object = new Object[size];
        object[0] = head.getObject();
        do {
            node = node.next;
            x++;
            object[x] = node.getObject();
        } while (x <= sizeArray);
        return object;
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }

    @Override
    public Object getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        List newList = new List();
        ListNode temporalNode = head;
        while (temporalNode.next != null) {
            temporalNode = temporalNode.next;
            if (temporalNode == from) {
                newList.add(temporalNode);
                while (temporalNode != to) {
                    temporalNode = temporalNode.next;
                    newList.add(temporalNode);
                }
                break;
            }
        }
        return newList;
    }

    @Override
    public List sortList() {
        return null;
    }

    @Override
    public ListNode rec(ListNode node) {
        if(node.next ==null){
            System.out.println(node.toString());
        }
        else{
            System.out.println(node.toString());
            return rec(node.next);
        }
        return null;
    }

}
