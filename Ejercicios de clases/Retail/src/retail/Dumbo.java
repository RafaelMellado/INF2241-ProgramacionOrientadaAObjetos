package retail;

public class Dumbo {
    private String direccion;
    private String nombreGerente;
    private Cliente clientes[];
    
    public Dumbo(String direccion, String nombreGerente, int tamaño)
    {
        this.direccion=direccion;
        this.nombreGerente=nombreGerente;
        if(tamaño>500)
        {
            clientes=new Cliente[tamaño];
        }
        else
        {
            clientes=new Cliente[500];
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    public boolean agregarCliente(String rut, String nombre, int montoCompras)
    {
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i]==null)
            {
                clientes[i]=new Cliente(rut, nombre, montoCompras);
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarCliente(String rutBuscado)
    {
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i]!=null && clientes[i].getRut().equals(rutBuscado))
            {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean agregarCliente(Cliente nuevo)
    {
        if(buscarCliente(nuevo.getRut())==false)
        {
            System.out.println("Cliente no encontrado");
            for(int i=0; i<clientes.length; i++)
            {
                if(clientes[i]==null)
                {
                    clientes[i]=nuevo;
                    return true;
                }
            }
        }
        return false;
    }
    
    public void mostrarClientes()
    {
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i]!=null)
            {
                System.out.println("Rut: "+clientes[i].getRut()+" - "+clientes[i].getNombre());
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
