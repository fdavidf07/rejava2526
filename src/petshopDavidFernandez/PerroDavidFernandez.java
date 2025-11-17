package petshopDavidFernandez;

public class PerroDavidFernandez {
	
	private String nombre,raza;
	private int edad;
	
	public PerroDavidFernandez(String nombre, String raza, int edad ) {
		this.edad= edad;
		this.nombre=nombre;
		this.raza=raza;
	}
	public String toString() {
		return ("Nombre: "+ nombre +"la edad es de "+ edad +"años y es de raza: "+ raza);
	}
	
	public void hacerRuido() {
		System.out.print("Guau");
	}
	
}
