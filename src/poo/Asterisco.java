
package poo;
import java.util.Scanner;
   
public class Asterisco {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("De que tamaño quieres la piramide?: ");
        int tam=sc.nextInt();
       
        for (int j=1; j<=tam; j++){
            for (int i=1; i<=j; i++){
            System.out.print("*");
        }
        System.out.println();
        } 
   
    }
    
}
