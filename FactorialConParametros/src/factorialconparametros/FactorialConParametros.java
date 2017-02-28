package factorialconparametros;

public class FactorialConParametros {

    public static void main(String[] args) {
        int numero, i=1, fact=1;
        
        numero=Integer.parseInt(args[0]);
        
        while(i<=numero)
        {
            fact*=i;
            i++;
        }
        
        System.out.println("El factorial de "+numero+" es "+ fact);
    }
    
}
