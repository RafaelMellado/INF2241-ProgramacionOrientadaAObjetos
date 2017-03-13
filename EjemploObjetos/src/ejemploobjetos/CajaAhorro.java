package ejemploobjetos;

public class CajaAhorro {
    
    private int saldo;
    private int transacciones;
    public CajaAhorro() {
       saldo = 0;
       transacciones = 0;
    }
    public void depositar( int monto ) {
        saldo = saldo + monto;
        transacciones++;
    }
    public void girar( int monto ) {
        saldo = saldo - monto;
        transacciones++;
    }
    public int obtenerSaldo() {
        return saldo;
    }
    public int obtenerTransacciones() {
        return transacciones;
    }    
}
