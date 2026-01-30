package ArrayMatriz.pio.daw.dfg.tema6.set;

import java.util.TreeSet;

public class AlumnoTreeSet {

	public static void main(String[] args) {
		TreeSet<Alumno>alumnos=new TreeSet<>();
		alumnos.add(new Alumno(265,"Ana"));
		alumnos.add(new Alumno(595,"Alvaro"));
		alumnos.add(new Alumno(156,"Diego"));
		alumnos.add(new Alumno(658,"Engel"));
		alumnos.add(new Alumno(954,"Moha"));

		for(Alumno alumno:alumnos) {
			System.out.println(alumno);
		}// fin for
		
	}

}
  