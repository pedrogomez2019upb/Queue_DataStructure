package edu.upb.ds.queue;

import java.util.Arrays;
import java.util.Scanner;

public class PriorityQueueArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n######################");
        System.out.println("\nBienveido al programa de cola de prioridades (Arrays)");
        System.out.println("\n######################");
        System.out.println("\nCuantos datos vas a ingresar?");
        int cantidad = sc.nextInt();
        ListQueue arrayPrioridad[] = new ListQueue[cantidad];
        for (int i = 0; i < arrayPrioridad.length; i++) {
            arrayPrioridad[i] = new ListQueue();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nPor favor ingresa el dato numérico #"+(i+1)+":");
            int datoNuevo = sc.nextInt();
            System.out.println("\nPor favor ingresa la prioridad de este dato numérico:");
            int prioridad = sc.nextInt();
            arrayPrioridad[prioridad].insert(datoNuevo);
        }
        System.out.println("\n######################");
        System.out.println("\nCola Ingresada (Arrays)");

        for (int i = 0; i < arrayPrioridad.length; i++)
        {
            System.out.println(arrayPrioridad[i].extract());
        }
        System.out.println("\n######################");
        System.out.println("\n######################");
        System.out.println("\nGracias por utilizar el programa de cola de prioridades (Arrays)");
        System.out.println("\n######################");
    }
}
//Developed by Pedro Gomez - ID:000396221