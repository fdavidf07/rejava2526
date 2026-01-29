package exament4;

public class IntegranteSeleccionDFG {
// mostrar atrivbutos
	public String nombre, apellidos ;
	public int id,edad;
	
	
	public IntegranteSeleccionDFG(String nombre, String apellidos, int id, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "IntegranteSeleccionDFG [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad
				+ "]";
	}
	public void concentrarse(){
		System.out.println("\nEstoy concentrado");
	}
	public void viajar () {
		System.out.println("\nEstoy viajando");
	}
	public String getNombreCompleto() {
		return nombre;
		
	}
}
