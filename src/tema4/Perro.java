package tema4;

public class Perro extends Mascotas {
	private String raza;
	private boolean tienePulgas;
	int edad;
	
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
		String mensaje="El perro ";
		mensaje += tienePulgas ? "SI" : "NO";
		mensaje +=" tiene pulgas ";
		System.out.print(mensaje);
	}
	
	public void calcularVacuna() {
		/*Se calcula el precio segun la edad
		 * si es menor o igual de 5 años precio base 5 € y 0,3 € por edad 
		 * entre 6 y 10 precio base 10 y 0,2 por año 
		 * 11 o mas: precio base 12 y 0,1 por edad
		 */
		double Precio = 0;
		if (edad<=5) {
			Precio=(20+ (edad *0.3));
		}else if (edad>=6 && edad<=10) {
			Precio=(15+ (edad*0.2));
		}else if (edad>=11) {
			Precio=(12+ (edad*0.1));
		}
		System.out.print("\nEl precio es "+Precio);
		
		
	}
	}
	

