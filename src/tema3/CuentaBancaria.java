package tema3;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;

    }
    public void ingresar(double monto) {
    if (monto >= 0) {
    this.saldo += monto;
    } else {
    System.out.println("El monto a ingresar debe ser positivo");
    }
    }

    public void retirar(double monto) {
    if (monto > 0 && this.saldo - monto >= 0) {
    this.saldo -= monto;
    } else {
    System.out.println("El monto a ingresar debe ser positivo o no tienes dinero serie de los valores del tipo ");
    }
    }

    public double getSaldo() {
    return this.saldo;
    }


    public String getTitular() {
    	return this.titular;
}

    public String toString() {
    return "El titular:" + titular +" Tiene un saldo del " + saldo;
}
}
