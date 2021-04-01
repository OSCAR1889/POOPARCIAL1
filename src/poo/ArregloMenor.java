package poo;
import java.util.Scanner;
public class ArregloMenor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arreglo[];
        System.out.print("Ingresa la cantida de numeros: ");
        int tam=sc.nextInt();
        int acomodo;
           arreglo=new int[tam];
        for (int i=0; i<tam; i++){
        System.out.print("Ingresa el numero "+(i+1)+": ");
        arreglo[i]=sc.nextInt();
        }
        for(int i=0; i<tam; i++){
        for(int j=0; j<tam-1; j++){
            if(arreglo[j]>arreglo[j+1]){
                acomodo=arreglo[j];
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=acomodo;
            }
        }
        }
        for (int i=0; i<tam; i++){
        System.out.println(arreglo[i]);
        }
    }
}       