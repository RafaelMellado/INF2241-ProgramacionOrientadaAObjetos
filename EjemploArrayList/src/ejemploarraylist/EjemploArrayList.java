package ejemploarraylist;
import java.util.*;

public class EjemploArrayList {

    public static void main(String[] args) {
        
        /*Declaración de un ArrayList*/
        ArrayList<String> arrayListEjemplo = new ArrayList<String>();

        /*Se agregarán 10 registros*/
        for(int i=1; i<=10; i++)
        {
            String registroAux="Registro "+i;
            arrayListEjemplo.add(registroAux);
        }
        
        /*También se puede agregar en una posición especifica, ejemplo en la pos 5*/
        arrayListEjemplo.add(5, "Ejemplo Registro");

        /*Mostraremos los elementos*/
        Iterator<String> iterador = arrayListEjemplo.iterator();
        
        while(iterador.hasNext())
        {
            String dato= iterador.next();
            System.out.println(dato);
        } 
    }
}
