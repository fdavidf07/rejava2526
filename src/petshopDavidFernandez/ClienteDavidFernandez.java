package petshopDavidFernandez;

public class ClienteDavidFernandez {

	private String nombre, direccion,PerroDavidFernandez;
	private petshopDavidFernandez.PerroDavidFernandez perros;
	
	public ClienteDavidFernandez(PerroDavidFernandez perro, String nombre, String direccion) {
		this.direccion=direccion;
		this.nombre=nombre;
	}
	public String toString() {
		return ("Nombre: "+nombre +", la direccion es: "+direccion+ ", y el perro es: "+PerroDavidFernandez);
		}
	public void comprarPerro(PerroDavidFernandez perros){
		this.perros=perros;
	}
}
