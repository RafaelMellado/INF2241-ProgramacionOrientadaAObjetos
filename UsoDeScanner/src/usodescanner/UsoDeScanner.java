package usodescanner;
import java.util.*;

public class UsoDeScanner 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        String palabra;
        int numeroEntero;
        double numeroDouble;
        
        System.out.println("Ingrese un String:");
        palabra= teclado.nextLine();
        
        System.out.println("Ingrese un numero entero");
        numeroEntero=teclado.nextInt();
        
        System.out.println("Ingrese un numero double");
        numeroDouble=teclado.nextDouble();
        
        System.out.println("String: "+palabra);
        System.out.println("Numero entero: "+numeroEntero);
        System.out.println("Numero double: "+numeroDouble);
        
    }
    
}
