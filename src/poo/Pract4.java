package poo;

import java.util.Scanner;

public class Pract4 {

    Scanner sc = new Scanner(System.in);
    private int cal;
    int arreglo[] = new int[10];

    public void IngresaCalis() {
        System.out.println("Ingrese las 10 calificaciones  ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Calificacion : ");
            arreglo[i] = sc.nextInt();
        }
    }
    public int SumaCal() {
        for (int i = 0; i < arreglo.length; i++) {
           cal += arreglo[i];
        }
        return cal;
    }

    public int Prom(int a) {
        a /= arreglo.length;
        return a;
    }
}
