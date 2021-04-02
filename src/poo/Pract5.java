package poo;

import java.util.Scanner;

public class Pract5 {

    Scanner sc = new Scanner(System.in);
    private int num = 0;
    int arregl[] = new int[10];

    public void IngresaNum() {
        System.out.println("Ingrese los 10 numeros  ");
        for (int i = 0; i < arregl.length; i++) {
            System.out.print("Casilla " + (i + 1) + ": ");
            arregl[i] = sc.nextInt();
        }
    }

    public void Num() {
        System.out.println("Ingresa el numero de casilla a buscar: ");
        num = sc.nextInt();
    }

    public void Mostrar() {
        if (num >= 1 && num <= 10) {
            System.out.println("El indice del valor es: '"+arregl[(num - 1)]+"' es: "+ num);
        } else {
            System.out.println("-1");
        }
    }

}
