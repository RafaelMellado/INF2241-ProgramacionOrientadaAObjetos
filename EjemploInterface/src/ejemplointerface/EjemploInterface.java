package ejemplointerface;
import java.util.*;

/**
 *
 * @author rafaelmellado
 */
public class EjemploInterface {

    /* ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto*/
    
  //  public static ArrayList integrantes = new ArrayList();

    
    public static void main(String[] args) {
        
        /* ArrayList de referencias a objetos tipo Clase SeleccionFutbol. */
            
        ArrayList integrantes = new ArrayList();
        
        SeleccionFutbol pizzi = new Entrenador(1, "Juan Antonio", "Pizzi", 49, 453624);
        SeleccionFutbol bravo =  new Futbolista(2, "Claudio", "Bravo", 33, 1, "Portero");
        SeleccionFutbol jorge = new Masajista ("Kinesiologo", 20, 3, "Jorge", "Vera", 56);
        
        /*Se agregan las referencias al arrayList*/
        
        integrantes.add(0,pizzi);
        integrantes.add(1,bravo);
        integrantes.add(2,jorge);
                
        /*Concentracion: Mostrar todos los integrantes*/
        System.out.println("\nTodos los integrantes comienzan una concentracion, (todos ejecutan el mismo método): ");
        
        for(int i=0; i<integrantes.size(); i++)
        {
            System.out.println(((SeleccionFutbol)integrantes.get(i)).getNombre()+" "+((SeleccionFutbol)integrantes.get(i)).getApellidos());
        }
         
        /*Entrenamiento: Mostrar todos los tipos de entrenamiento*/
        System.out.println("\nTodos los integrantes entrenan, (todos ejecutan un método disitnto): ");
        
         for(int i=0; i<integrantes.size(); i++)
        {
            System.out.print("\n   *"+((SeleccionFutbol)integrantes.get(i)).getNombre()+" Su entrenamiento es: ");
            ((SeleccionFutbol)integrantes.get(i)).entrenar();
            
            /*IMPORTANTE: EL METODO ENTRENAR (Y OTROS METODOS) SOLO POR EJEMPLO TIENEN SYSTEM.OUT.PRINTLN 
            DENTRO DE SU IMPLEMENTACION YA QUE BAJO LAS BUENAS PRÁCTICAS DE POO ESTA IMPLEMENTACIÓN DEBERIA SER DEL MAIN*/
        }
    }
}

