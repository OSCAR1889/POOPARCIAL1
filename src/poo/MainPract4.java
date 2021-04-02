
package poo;

public class MainPract4 {
    
    public static void main(String[] args) {
        Pract4 pract = new Pract4();
        pract.IngresaCalis();
        int res = pract.SumaCal();
        System.out.println("El promedio es: " + pract.Prom(res));
    }
}
