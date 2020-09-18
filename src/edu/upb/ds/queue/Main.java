package edu.upb.ds.queue;

public class Main {

    public static void main(String[] args) {
        ListQueue list1 = new ListQueue();
        //list1.insert("1");
        list1.insert("2");
        //list1.insert("3");
        System.out.println(list1);
        list1.extract();
        System.out.println(list1);
    }
}
