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
        Object cabeza = listaQueue.getHead();
        listaQueue.remove(listaQueue.head.next);
        return cabeza;
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
