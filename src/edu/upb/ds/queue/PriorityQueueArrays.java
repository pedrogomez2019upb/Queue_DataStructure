package edu.upb.ds.queue;

import java.util.Arrays;
import java.util.Scanner;

public class PriorityQueueArrays {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n######################");
        System.out.println("\nBienveido al programa de cola de prioridades (Arrays)");
        System.out.println("\n######################");
        System.out.println("\nCuantos datos vas a ingresar?");
        int cantidad = sc.nextInt();
        ListQueue arrayPrioridad[] = new ListQueue[cantidad];
        for (int i = 0; i < arrayPrioridad.length; i++) {
            arrayPrioridad[i] = new ListQueue();
        }
        for(int i=0;i<cantidad;i++){
            System.out.println("\nPor favor ingresa el dato numérico:");
            int datoNuevo= sc.nextInt();
            System.out.println("\nPor favor ingresa la prioridad del dato numérico:");
            int prioridad= sc.nextInt();
            arrayPrioridad[prioridad].insert(datoNuevo);
        }

        for (int i = 0; i < arrayPrioridad.length; i++) {
                System.out.println(arrayPrioridad[i].extract());
        }
    }

}
//Developed by Pedro Gomez - ID:000396221