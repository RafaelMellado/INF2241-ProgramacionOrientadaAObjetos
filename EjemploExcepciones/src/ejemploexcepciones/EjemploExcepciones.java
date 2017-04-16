package ejemploexcepciones;

/**
 *
 * @author Rafael
 */
public class EjemploExcepciones 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Aqui van todas las instrucciones, esto es el caso feliz que nada falla!");
            
            /* Para probar como funciona descomentar lo de abajo, el error es que el lector no está definido, si no usaramos excepciones saldria un error de compilacion pero con esto no aparece, osea no se cae*/
             //int numero=Integer.ParseInt(lector.readline());
            
             /*Al descomentar la linea de arriba esta otra instrccion no se ejecutará ya que 'se cae'*/
            System.out.println("Otra instruccion más en el try..\n");

        }
        catch (Exception e) 
        { 
            System.out.println("Si se produce algun error dentro del try se ejecutará esto");  
        }
        finally
        { 
            System.out.println("Esto se ejecuta independientemente del try o catch"); 
        }
         
         
    }
    
}
