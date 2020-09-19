package edu.upb.ds.queue;

public class Main {

    public static void main(String[] args) {
        ListQueue cola1 = new ListQueue();
        System.out.println(cola1.size());
        //list1.insert("1");
        cola1.insert("2");
        System.out.println(cola1.size());
        System.out.println(cola1.extract());
        System.out.println(cola1.extract());
        //list1.insert("3");
        System.out.println(cola1);
        //list1.extract();
        System.out.println(cola1);
    }
}
