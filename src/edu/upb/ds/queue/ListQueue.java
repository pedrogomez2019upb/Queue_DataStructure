package edu.upb.ds.queue;

public class ListQueue implements QueueInterface{

    private List listaQueue= new List();

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
        try {
            Object cabeza = listaQueue.getTail();
            listaQueue.remove(listaQueue.tail);
            return cabeza;
        }
        catch (Exception e){
            Object error = null;
            return error ;
        }
    }

    @Override
    public boolean insert(Object object) {
        return listaQueue.insertHead(object);
    }

    @Override
    public int size() {
        return listaQueue.size;
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
        listaQueue=listaNueva;
    }

    @Override
    public String toString() {
        return "ListQueue{" +
                "listaQueue=" + String.valueOf(listaQueue) +
                '}';
    }
}
