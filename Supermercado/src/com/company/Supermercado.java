package com.company;

public class Supermercado
{
    private String nombre;
    private String direccion;
    private Sucursal sucursales[];
    private Cliente clientes[];

    public Supermercado(String nombre, String direccion, int cantidadSucursales, int cantidadClientes)
    {
        this.nombre=nombre;
        this.direccion=direccion;
        this.sucursales=new Sucursal[cantidadSucursales];
        clientes=new Cliente[cantidadClientes];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdSucursalMasCupoAcumulado()
    {
        int posicionMayor=-1;

        for(int i=0; i<sucursales.length; i++)
        {
            if(sucursales[i]!=null && (posicionMayor==-1 || sucursales[i].getSumatoriaCupos()>sucursales[posicionMayor].getSumatoriaCupos()))
                posicionMayor=i;
        }

        if(posicionMayor!=-1)
            return sucursales[posicionMayor].getId();
        return -1;
    }

    public void eliminarClienteDeSucursales(int idCliente)
    {
        for(int i=0; i<sucursales.length; i++)
        {
            if(sucursales[i]!=null)
                sucursales[i].eliminarCliente(idCliente);
        }
    }

    public Cliente quitarCliente(int idCliente)
    {
        Cliente clienteQuitado=null;

        eliminarClienteDeSucursales(idCliente);

        for(int i=0; i<clientes.length && clientes[i]!=null; i++)
        {
            if(clientes[i].getId()==idCliente)
            {
                clienteQuitado=clientes[i];
                clientes[i]=null;

                /*COMPACTAMOS*/
                for(int j=i; j<clientes.length-1; j++)
                    clientes[j]=clientes[j+1];
                clientes[clientes.length]=null;

                return clienteQuitado;
            }
        }

        return null;
    }
}
