package factorial;

public class Factorial {
    
    public static void main(String[] args) {
        int número, i=1, fact=1;
        número = 3;
        
        while( i <= número ) 
        {
            fact = fact * i;
            i++;
        }
        System.out.println( "El factorial de " + número + " es " + fact );   
    }
}
