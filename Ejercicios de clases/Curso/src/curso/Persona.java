package curso;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int notas[];
    private Evaluacion evaluaciones[];

    public Persona(String nombre, String apellido, int edad, int cantidadNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if(cantidadNotas>0)
            notas= new int[cantidadNotas];
        else
            notas=null;
        evaluaciones=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String saludar()
    {
        return "Hola!";
    }
    

    
}
