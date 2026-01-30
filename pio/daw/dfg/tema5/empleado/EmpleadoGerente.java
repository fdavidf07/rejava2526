package pio.daw.dfg.tema5.empleado;

public class EmpleadoGerente extends EmpleadoAbstract {

	private double bonoPorObjetivos;
	
	
	public EmpleadoGerente(String nombre, String apellido, double salarioBase, double bonoPorObjetivos) {
		super(nombre, apellido, salarioBase);
		this.bonoPorObjetivos= bonoPorObjetivos;
	}

		
	public double getBonoPorObjetivo() {
		return bonoPorObjetivos;
	}


	public void setBonoPorObjetivo(double bonoPorObjetivo) {
		this.bonoPorObjetivos = bonoPorObjetivo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "EmpleadoGerente [bonoPorObjetivo=" + bonoPorObjetivos + "]";
	}


	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase()+bonoPorObjetivos;
	}
	
}
