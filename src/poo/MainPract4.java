
package poo;

public class MainPract4 {
    
    public static void main(String[] args) {
        Pract4 pract = new Pract4();
        System.out.println();
        pract.IngresaCalis();
        int res = pract.SumaCal();
        System.out.println("El promedio es: " + pract.Prom(res));
    }
}
