package pio.daw.dfg.tema5.empleado;

public class EmpleadoTest {

	public static void main(String[] args) {
	EmpleadoGerente Gerente=new EmpleadoGerente("Diego","Hernandez",3500,500);
	Empleadovendedor Vendedor= new Empleadovendedor("Fran", "Garcia", 1800, 300);
	Empleadovendedor Vendedor2 = new Empleadovendedor("Juan", "Alberto", 1900, 450);
	System.out.println(Gerente);
	System.out.println(Vendedor);
	System.out.println(Vendedor2);
	
	Gerente.setBonoPorObjetivo(500);
	
	
	
	System.out.println("Salario total del gerente: "+ Gerente.calcularSalario());
	System.out.println("Salario total del vendedor 1: "+ Vendedor.calcularSalario());
	System.out.println("Salario total del vendedor 2: "+ Vendedor2.calcularSalario());
	}

}
