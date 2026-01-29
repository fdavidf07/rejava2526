package tema4;
import java.util.Calendar;

public class ProfesorInterinoDFG extends ProfesorDFG {

	private Calendar fechaInicioInterinidad;

	public ProfesorInterinoDFG(String dniProfesor, String nombre, String apellidos, int paramEdad,Calendar fechaInicioInterinidad) {
		super(dniProfesor, nombre, apellidos, paramEdad);
		this.fechaInicioInterinidad= fechaInicioInterinidad;
	}
	

	@Override
	public String toString() {
		return "ProfesorInterinoDFG [fechaInicioInterinidad=" + fechaInicioInterinidad + ", nomina=" +super.toString()+ nomina + "]";
	}
	
	
}
