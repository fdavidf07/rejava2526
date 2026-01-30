package pio.daw.dfg.tema6.set;

public class Alumno implements Comparable<Alumno> {

	public Alumno(int nIA, String nombre) {
		super();
		this.NIA = nIA;
		this.nombre = nombre;
	}
	private int NIA;
	private  String nombre;
	public int getNia() {
		return NIA;
	}
	public void setNia(int nia) {
		this.NIA = nia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
	return "Alumno [nia=" + NIA + ", nombre=" + nombre + "]";
	}
	@Override
	public int compareTo(Alumno otroAlumno) {
		// Comparo por NIA yo mismo con otro alumno
		
		return Integer.compare(this.NIA,otroAlumno.NIA);
	}
	
}
