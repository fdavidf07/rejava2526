package exament4;

public class MasajistaDFG extends IntegranteSeleccionDFG {

	private String titulacion;
	private int aniosExperiencia;
	
	
	public MasajistaDFG(String nombre, String apellidos, int id, int edad) {
		super(nombre, apellidos, id, edad);
		this.aniosExperiencia=aniosExperiencia;
		this.titulacion=titulacion;
	}



	@Override
	public String toString() {
		return "MasajistaDFG [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + "]";
	}
	
	public void concentrarse(){
		System.out.println("\nEstoy concentrado");
	}
	public void viajar () {
		System.out.println("Estoy viajando");
	}
	public void darMasaje() {
		System.out.println("Estoy dando un masaje");
	}
}
