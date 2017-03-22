package interaccionobjetos;

public class InteraccionObjetos {

    public static void main(String[] args) {
        
        PersonaPrivada p1;
        PersonaPublica p2;
        
        p1=new PersonaPrivada("Juan Fernandez", 25);
        p2=new PersonaPublica("Maria Gomez", 27);
        
        System.out.println("------- Configuracion inicial:--------------");
        System.out.println(p1.saludar());
        System.out.println(p2.saludar());
        
       
        
        String aux = p2.getNombre();
        System.out.println("\n"+p1.saludoInicialMutuo(aux));
        System.out.println(p2.saludoRespuestaMutuo(p1.getNombre(), "muy bien"));
        
        /*Aqui rompe el encapsulamiento*/
        p2.nombre="Gabriel Fernandez";
        System.out.println(p2.saludar());
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    }
    
}
