package edu.upb.ds.queue;

import java.util.PriorityQueue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ListQueue cola1 = new ListQueue();
        PriorityQueueLists queue1=new PriorityQueueLists();
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
        PriorityQueue<String> queue=new PriorityQueue<String>();
/*
        ListNode nodo = queue1.nuevoNodo(4,1);
        queue1.push(nodo,5,1);
        queue1.push(nodo,6,2);
        queue1.push(nodo,7,0);
        System.out.println(queue1.peek(nodo));
        queue1.pop(nodo);
        System.out.println(queue1.peek(nodo));

        edu.upb.ds.queue.PriorityQueue pq = pq.nuevoNodo(4,1);
        pq =push(pq, 5, 2);
        pq =push(pq, 6, 2);
        pq =push(pq, 7, 0);

 */

    }

}
