package tema4;
public class Aves extends Mascotas {
	private boolean pico;
	private boolean vuela;
	
	
	public Aves(String nombre, int anyoNacimiento, boolean pico, boolean vuela) {
		super(nombre, anyoNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}


	@Override
	public String toString() {
		return "Aves [pico=" + pico + ", vuela= " + vuela + super.toString()+ "]";
	}
	
}
