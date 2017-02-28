package factorialinteractivo;
import   java.io.* ;

public class FactorialInteractivo {

    public static void main(String[] args) throws IOException {
        
        int número, i=1, fact=1;
        BufferedReader lector = new  BufferedReader( new InputStreamReader( System.in ) );
        String ingresado;
        
        System.out.println("Ingrese número para cálculo de factorial: ");
        ingresado = lector.readLine(  );
        número = Integer.parseInt( ingresado );
        
        while( i <= número )
        {
           fact = fact * i;
           i++;
        }
        
        System.out.println( "El factorial de " + número + " es " + fact );
    }
}
