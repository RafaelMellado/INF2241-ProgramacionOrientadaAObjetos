package curso;

public class Curso {

    public static void main(String[] args) {

        Persona alumno1=new Persona("Juan","Perez",20,10);
        
        System.out.println(alumno1.saludar());
        System.out.println("Soy "+alumno1.getNombre()+" "+alumno1.getApellido());
        System.out.println("y mi edad es: "+alumno1.getEdad());
        
        
       
       
    }
    
}
