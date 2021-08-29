package com.company;

public class Sucursal
{
    private int id;
    private String nombre;
    private Cliente clientes[];

    public Sucursal(int id, String nombre, int cantidadClientes) {
        this.id = id;
        this.nombre = nombre;
        this.clientes = new Cliente[cantidadClientes];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSumatoriaCupos()
    {
        int sumatoria=0;
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i]!=null)
                sumatoria+=clientes[i].getCupo();
        }
        return sumatoria;
    }

    public void eliminarCliente(int idCliente)
    {
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i]!=null && clientes[i].getId()==idCliente)
                clientes[i]=null;
        }
    }

}
