package tema3;

public class CuentaBancariaStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CuentaBancariaStatic cuenta1=new CuentaBancariaStatic("David Fernandez", 1000);
CuentaBancariaStatic cuenta2=new CuentaBancariaStatic("Alvaro Escobar", 2000);
CuentaBancariaStatic cuenta3=new CuentaBancariaStatic("Diego Navarro", 1500);
cuenta1.ingresar(200);
cuenta2.retirar(100);
cuenta3.retirar(10);
System.out.println(cuenta1.toString());
System.out.println(cuenta2.toString());
System.out.println(cuenta3.toString());
	}

}
