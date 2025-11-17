package tema3;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ggwhf ghfsf sgfhaefb nhsgfh
CuentaBancaria cbDavid=new CuentaBancaria("David Fernandez", 1000);
cbDavid.ingresar(500);
cbDavid.retirar(200);
		//Hola 
System.out.print("El saldo actual de"+cbDavid.getTitular() +" es de: "+cbDavid.getSaldo());
System.out.print(cbDavid.toString());
	}
}

 


