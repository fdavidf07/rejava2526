package tema4;

public class ProfesorDFG {

	 private String dniProfesor,nombre,apellidos;
	 protected float nomina;
	 protected enum modulo {
		 BBDD,MARCAS,PROGRAMACION,ENTORNOS,INTERFACES
	 }
	 
	 public ProfesorDFG( String dniProfesor,String nombre,String apellidos,int paramEdad ) {
	 }
	 @Override
	 public String toString() {
		return "ProfesorDFG [dniProfesor=" + dniProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", nomina=" + nomina + "]";
	 }
	 public float importeNomina(float paramSueldoBase, float paramComplementos,float paramDeducciones) {
		 nomina= ((paramSueldoBase+paramComplementos)-paramDeducciones);
		 return nomina;
	 }
}
