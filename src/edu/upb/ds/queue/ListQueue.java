package edu.upb.ds.queue;

public class ListQueue implements QueueInterface{

    private List listaQueue= new List();

    public ListQueue(){}

    public ListQueue(List listaQueue) {
        this.listaQueue = listaQueue;
    }

    @Override
    public void clear() {
        listaQueue.clear();
    }

    @Override
    public boolean isEmpty() {
        return listaQueue.isEmpty();
    }

    @Override
    public Object extract() {
        Object cabeza = listaQueue.getTail();
        listaQueue.remove(listaQueue.tail.next);
        return cabeza;
    }

    @Override
    public boolean insert(Object object) {
        return listaQueue.insertHead(object);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean search(Object object) {
        return listaQueue.contains(object);
    }

    @Override
    public void sort() {
        listaQueue.sortList();
    }

    @Override
    public void reverse() {
        List listaNueva = new List();
        for(int i =0; i<listaQueue.size ; i++){
            listaNueva.insertTail(listaQueue.get(i));
        }
    }

    @Override
    public String toString() {
        return "ListQueue{" +
                "listaQueue=" + String.valueOf(listaQueue) +
                '}';
    }
}
