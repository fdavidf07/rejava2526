package tema4;

public class Mascotas {

	private String nombre;
	private int anyoNacimiento;
	
	/**
	 * 
	 * @param nombre
	 * @param anyoNacimiento
	 */
	public Mascotas(String nombre, int anyoNacimiento) {
		super();
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public void setanyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento= anyoNacimiento;
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", anyoNacimiento=" + anyoNacimiento + "]";
	}
 
}
