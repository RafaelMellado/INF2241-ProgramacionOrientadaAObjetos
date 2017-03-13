package ejemploobjetos;

public class EjemploObjetos {
    public static void main(String[] args) {
        
        CajaAhorro cta1;
        
        cta1 = new CajaAhorro();
        cta1.depositar(1000);
	cta1.depositar(500);
	cta1.girar(300);
	
        int saldo = cta1.obtenerSaldo();
	int trans = cta1.obtenerTransacciones();
	 
        System.out.println( “El saldo es” + saldo );
	System.out.println( “Se han hecho” + trans + “transacciones” )
    }
}
