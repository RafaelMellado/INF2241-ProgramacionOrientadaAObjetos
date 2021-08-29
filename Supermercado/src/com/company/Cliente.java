package com.company;

public class Cliente
{
    private int id;
    private String nombre;
    private int cupo;

    public Cliente(int id, String nombreCliente, int cupo)
    {
        this.id=id;
        nombre=nombreCliente;
        this.cupo=cupo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCupo() {
        return cupo;
    }
}
