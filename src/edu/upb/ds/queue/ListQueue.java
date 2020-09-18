package edu.upb.ds.queue;

public class ListQueue implements QueueInterface{

    public int size;
    private List lista;

    public ListQueue(){}

    public ListQueue(int size, List lista) {
        this.size = 0;
        this.lista = null;
    }

    @Override
    public void clear() {
        lista=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public Object extract() {
        if (!isEmpty()){
                Object object= lista.tail.getObject();
                lista.tail= lista.tail.next;
                return object;
        } else {
            return null;
        }
    }

    @Override
    public boolean insert(Object object) {
        ListNode temporaryNode = new ListNode(object);
        if (!isEmpty()){
            temporaryNode.next=lista.tail;
            lista.tail=temporaryNode;
        }
        else {
            temporaryNode.next=lista.tail;
            lista.tail=temporaryNode;
        }
        size++;
        return true;
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
                ", lista=" + lista +
                '}';
    }
}
