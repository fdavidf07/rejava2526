package pio.daw.dfg.tema5.empleado;

public class Empleadovendedor extends EmpleadoAbstract {

	private double comisionPorVenta;
	private double ventasrealizadas;
	
	

	public Empleadovendedor(String nombre, String apellido, double salarioBase, double comisionPorVenta) {
		super(nombre, apellido, salarioBase);
		this.comisionPorVenta = comisionPorVenta;
		this.ventasrealizadas= 0;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}

	public double getVentasrealizadas() {
		return ventasrealizadas;
	}

	public void setVentasrealizadas(double ventasrealizadas) {
		this.ventasrealizadas = ventasrealizadas;
	}

	

	@Override
	public String toString() {
		return super.toString()+"Empleadovendedor [comisionPorVenta=" + comisionPorVenta + ", ventasrealizadas=" + ventasrealizadas
				+ "]";
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		// salario base + ventas realizadas aplicando la comision
		return getSalarioBase()+(this.ventasrealizadas*this.comisionPorVenta);
	}

}
