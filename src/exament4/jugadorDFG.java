package exament4;

public class jugadorDFG extends IntegranteSeleccionDFG {

	private String demarcacion;
	private int dorsal;
	
	
	public jugadorDFG(String nombre, String apellidos, int id, int edad) {
		super(nombre, apellidos, id, edad);
		this.demarcacion=demarcacion;
		this.dorsal=dorsal;
		}
	
	@Override
	public String toString() {
		return "jugadorDFG [demarcacion=" + demarcacion + ", dorsal=" + dorsal + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", id=" + id + ", edad=" + edad + "]";
	}
	
	public void jugarPartido() {
		System.out.println("Estoy jugando un partido");
	}
	
	public void entrenar() {
		System.out.println("Estoy Entrenando");
	}	
	public void viajar() {
		System.out.println("Estoy viajando");
	}
	public void concentrarse(){
		System.out.println("\nEstoy concentrado");
	}
}
