package com.company;

public class Main {

    public static void main(String[] args)
    {
        Supermercado jumbito=new Supermercado("Dumbo","Calle Falsa 1234", 50, 200);

        if(jumbito.getIdSucursalMasCupoAcumulado()!=-1)
            System.out.println("La sucursal con mayor saldo es la de id: "+jumbito.getIdSucursalMasCupoAcumulado());





        int idSucursalMayor=jumbito.getIdSucursalMasCupoAcumulado();

        if(idSucursalMayor!=-1)
            System.out.println("La sucursal con mayor saldo es la de id: "+idSucursalMayor);

        Cliente quitado= jumbito.quitarCliente(667);

        if(quitado!=null)
        {
            System.out.println("El cliente "+quitado.getNombre()+" ha sido quitado correctamente");
        }
        else {
            System.out.println("Error al quitar el cliente");
        }


    }
}
