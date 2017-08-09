package saludador;
import java.io.*;

public class Saludador 
{

    public static void main(String[] args) throws IOException
    {
        /*Declarar variables*/
        String nombre;
        int edad;
        
        BufferedReader lector = new  BufferedReader( new InputStreamReader( System.in ) );

        
        /*Solicitar datos*/
        System.out.println("Ingrese su nombre:");
        nombre= lector.readLine();
        System.out.println("Ahora ingresa tu edad:");
        edad = Integer.parseInt( lector.readLine() );
        
        /*Calculo*/
        int edadEnDias= edad*365;
        
        /*Despliegue*/
        System.out.println("Hola "+nombre+", tu edad en días es: "+edadEnDias);
        
    }
    
}
