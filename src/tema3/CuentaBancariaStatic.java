package tema3;
/**
 * Clase CuentaBAncariaStatic creada por
 * @author David Fernandez
 * @since 31-oct-2025
 */
public class CuentaBancariaStatic {
	/** Titular de la cuenta*/
    private String titular;
    private double saldo;
    //Crea un atributo estatico para contar el numero de cuentas.
    /** Saldo de cuenta*/
    
    private static int numeroCuentas=0;
   //constructor para inicializar la cuenta
    /**
     * Constructor de la clase.Incrementa el numero de cuentas
     * @param titular String
     * @param saldo double
     */
    public CuentaBancariaStatic(String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;
    this.numeroCuentas ++;
    }
    //metodo ingresar dinero
    /**
     * Metodo ingresar dinero
     * @param Cantidad double
     */
    public void ingresar(double monto) {
    if (monto >= 0) {
    this.saldo += monto;
    } else {
    System.out.println("El monto a ingresar debe ser positivo");
    }
    }
    /**
     * metodo retirar dinero
     * @param cntidad double
     */
    public void retirar(double monto) {
    if (monto > 0 && this.saldo - monto >= 0) {
    this.saldo -= monto;
    } else {
    System.out.println("El monto a ingresar debe ser positivo o no tienes dinero serie de los valores del tipo ");
    }
    }
    /**
     * Metodo Saber Saldo Actual
     * @return double
     */
    public double getSaldo() {
    return this.saldo;
    }
    /**
     * Metodo saber Titular
     * @return String
     */
    public String getTitular() {
    	return this.titular;
}
    /**
     * 
     */
    public String toString() {
    return "El titular:" + titular +" tiene un saldo del " + saldo + " ,numero de cuentas= "+ numeroCuentas;
}
    public static int getNumeroCuentas() {
    	return numeroCuentas;
    }
 
}
