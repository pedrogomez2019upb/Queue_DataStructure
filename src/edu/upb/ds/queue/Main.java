package edu.upb.ds.queue;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ListQueue cola1 = new ListQueue();
        System.out.println(cola1.size());
        //list1.insert("1");
        cola1.insert("Olga");
        cola1.insert("Checho");
        cola1.insert("Pedro");
        cola1.insert("Tefa");
        System.out.println(cola1.size());
        System.out.println(cola1.extract());
        System.out.println(cola1.extract());
        cola1.reverse();
        System.out.println(cola1.extract());
        //list1.insert("3");
        System.out.println(cola1);
        //list1.extract();
        System.out.println(cola1);
        Stack<String> prueba = new Stack<>();
    }
}
