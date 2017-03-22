package retail;

public class Retail {

    public static void main(String[] args) {
        
        Dumbo supermercado = new Dumbo("Freire 567, El Belloto","Juan Perez",2000);

        System.out.println("Clientes:");
        supermercado.mostrarClientes();
        
        String rut="12345678-9";
        boolean resultado=supermercado.agregarCliente(rut, "Joaquin Lavin", 780000);
        
        if(resultado==true)
        {
            System.out.println("El cliente "+ rut+" fue agregado correctamente!");
        }
        else
        {
            System.out.println("No se pudo agregar cliente");
        }
        
        Cliente nuevo = new Cliente("13456789-0","Miguel Piñera",250000);
        System.out.println("----------------- "+nuevo.getNombre());
        
        supermercado.agregarCliente(nuevo);
        
        
        
        
        
        
        
        nuevo = new Cliente("13456789-0","Miguel Piñera",250000);

        resultado=supermercado.agregarCliente(nuevo);

        
        if(resultado==true)
        {
            System.out.println("El cliente "+ rut+" fue agregado correctamente!");
        }
        else
        {
            System.out.println("No se pudo agregar cliente repetido");
        }
        
        
        
        System.out.println("Clientes:");
        supermercado.mostrarClientes();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
