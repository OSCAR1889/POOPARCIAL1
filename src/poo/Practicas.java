import java.util.*;

public class Practicas
{
	public static void main (String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		String[] nombres = {"johan","joel","ana","fiorella"};
		String nom;
		int n;
		boolean encontrado = false;
    
		System.out.println("ingrese un nombre");
		nom = teclado.next();
     
		for(n = 0; n < nombres.length; n++)
		{ 
			if (nom.equals(nombres[n]))
			{
				System.out.println("dato encontrado");
				encontrado = true;
			}
		}
		
		if (!encontrado)
			System.out.println("no encontrado");
    }
}