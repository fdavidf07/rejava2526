package petshopDavidFernandez;

public class TiendaDavidFernandez {

	private String nombre, direccion,ClienteDavidFernandez;
	private petshopDavidFernandez.ClienteDavidFernandez cliente;
	
	public TiendaDavidFernandez(ClienteDavidFernandez cliente, String nombre, String direccion) {
		this.direccion=direccion;
		this.nombre=nombre;
	}
	public String toString() {
		return ("Nombre: "+nombre +", la direccion es: "+direccion+ ", y el cliente es: "+ClienteDavidFernandez);
		}
	public void agregarCliente(ClienteDavidFernandez cliente) {
		this.cliente=cliente;
	}
}
