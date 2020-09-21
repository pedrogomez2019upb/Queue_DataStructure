package edu.upb.ds.queue;

import java.util.*;

public class PriorityQueueLists {

    public static class nodoQueue {
        int datonumerico;
        int prioridad;
        nodoQueue next;
    }

    public static nodoQueue nuevoNodo(int d, int p)
    {
        nodoQueue temporaryNode = new nodoQueue();
        temporaryNode.datonumerico = d;
        temporaryNode.prioridad = p;
        temporaryNode.next = null;

        return temporaryNode;
    }

    public static int obtenerElemento(nodoQueue head)
    {
        return head.datonumerico;
    }

    public static nodoQueue eliminarElemento(nodoQueue head)
    {
        head  = head.next;
        return head;
    }


    public static nodoQueue crearElemento(nodoQueue head, int d, int p)
    {
        nodoQueue inicio = head;
        nodoQueue temporalNode = nuevoNodo(d, p);

        // Al tener una prioridad menor que el otro nodo,
        //se agrega antes del nodo cabezal y se cambia el cabezal
        if (head.prioridad > p) {
            temporalNode.next = head;
            head = temporalNode;
        }
        else {
            while (inicio.next != null &&
                    inicio.next.prioridad < p) {
                inicio = inicio.next;
            }
            temporalNode.next = inicio.next;
            inicio.next = temporalNode;
        }
        return head;
    }


    public static boolean isEmpty(nodoQueue head)
    {
        return (head == null);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n######################");
        System.out.println("\nBienveido al programa de cola de prioridades (Listas)");
        System.out.println("\n######################");
        System.out.println("\nCuantos datos vas a ingresar?");
        int cantidad = sc.nextInt();
        System.out.println("\nPor favor ingresa el primer dato numérico:");
        int datonum1= sc.nextInt();
        System.out.println("\nPor favor ingresa la prioridad del dato numérico:");
        int prioridadNum1=sc.nextInt();
        nodoQueue pq = nuevoNodo(datonum1, prioridadNum1);
        for (int i =0;i<cantidad-1;i++){
            System.out.println("\nPor favor ingresa el dato numérico:");
            int datoNuevo= sc.nextInt();
            System.out.println("\nPor favor ingresa la prioridad del dato numérico:");
            int prioridad= sc.nextInt();
            pq=crearElemento(pq,datoNuevo,prioridad);
        }
        System.out.println("\n######################");
        System.out.println("\nDatos Ingresados");
        while (!isEmpty(pq)) {
            System.out.println(obtenerElemento(pq));
            pq=eliminarElemento(pq);
        }
        System.out.println("\n######################");
        System.out.println("\nGracias por utilizar el programa de cola de prioridades (Listas)");
        System.out.println("\n######################");
    }
}
//Developed by Pedro Gomez - ID:000396221