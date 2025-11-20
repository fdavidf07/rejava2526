package tema4;

import java.time.Year;
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
	public void habla(String paramMensaje) {
		if (this instanceof Perro )
			paramMensaje= "\nSoy un perro y digo " +paramMensaje;
		else if (this instanceof Loro )
			paramMensaje="\nSoy un loro y"+paramMensaje;
		System.out.println(paramMensaje);
		
	}
    public int edad() {
    	return ((Year.now().getValue())- this.anyoNacimiento);
    }
}
