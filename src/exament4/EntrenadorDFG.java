package exament4;

public class EntrenadorDFG extends IntegranteSeleccionDFG {

	
	
	public EntrenadorDFG(String nombre, String apellidos, int id, int edad) {
		super(nombre, apellidos, id, edad);
		this.idFederacion=idFederacion;
	}

	@Override
	public String toString() {
		return "EntrenadorDFG [idFederacion=" + idFederacion + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", id=" + id + ", edad=" + edad + "]";
	}

	private String idFederacion;
	
	
	public void dirigirPartido() {
		System.out.println("Estoy dirigiendo un partido");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println("Estoy dirigiendo un Entrenamiento");
	}
	public void concentrarse(){
		System.out.println("\nEstoy concentrado");
	}
	public void viajar () {
		System.out.println("Estoy viajando");
	}
}
