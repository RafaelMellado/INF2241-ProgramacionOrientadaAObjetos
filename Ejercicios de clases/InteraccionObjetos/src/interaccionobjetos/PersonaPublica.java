package interaccionobjetos;

public class PersonaPublica {
    public String nombre;
    public int edad;

    public PersonaPublica(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String saludar()
    {
        return "Hola, mi nombre es "+nombre+" y soy un objeto Publico";
        
    }
    
    
     public String saludoInicialMutuo(String nombreSaludado)
    {
        return "Hola "+nombreSaludado+", Como estas?";
    }
    
    public String saludoRespuestaMutuo(String nombreSaludado, String estadoAnimo)
    {
        return "Hola "+nombreSaludado+" estoy "+estadoAnimo+", muchas gracias!";
    }
    
    
    
}
