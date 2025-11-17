package tema4;

public class Perro extends Mascotas {
	private String raza;
	private boolean tienePulgas;
	
	/**
	 * 
	 * @param nombre
	 * @param anyoNacimiento
	 * @param raza
	 * @param tienePulgas
	 */
	public Perro(String nombre, int anyoNacimiento, String raza, boolean tienePulgas) {
		super(nombre, anyoNacimiento);// super es como poner new Mascotas y llamar a los metodos de otra clase(arriba)
		this.raza = raza;
		this.tienePulgas = tienePulgas;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tienePulgas=" + tienePulgas + ", toString()=" + super.toString()+ "]";
	}
	public void tienePulgas() {
		
	}
	
	}
	

