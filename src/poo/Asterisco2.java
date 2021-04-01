/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author jenif
 */
public class Asterisco2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("De que tamaño quieres la piramide?: ");
        int tam = sc.nextInt();
        for (int j = 1; j <= tam; j++) {
            for (int z = tam; z > j; z--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j * 2 - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
