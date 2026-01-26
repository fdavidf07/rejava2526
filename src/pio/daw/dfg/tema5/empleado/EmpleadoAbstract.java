package pio.daw.dfg.tema5.empleado;

import java.util.UUID;
/* En java la clase .util.UUID representa un identificador unico universal
 * Es un numero de 128 bits y probabilidad muy baja de repetirse */

// atributos comunes en la clase "padre"


public abstract class EmpleadoAbstract {
	
	private String nombre;
	private String apellido;
	private String idEmpleado;
	private double salarioBase;
	// aunque una clase abstracta no se pueda crear directamente
	//se puede crear un constructor para inicializar los atributos comunes
	public EmpleadoAbstract(String nombre, String apellido, double salarioBase) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEmpleado = UUID.randomUUID().toString();
		this.salarioBase = salarioBase;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido() {
		return apellido;
	}
	
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public String getIdEmpleado() {
		return idEmpleado;
	}
	
	
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	@Override
	public String toString() {
		if (this instanceof EmpleadoGerente) {
			return "EmpleadoGerente [nombre=" + nombre + ", apellido=" + apellido + ", idEmpleado=" + idEmpleado
					+ ", salarioBase=" + salarioBase + "]";	
		}else if (this instanceof Empleadovendedor) {
			return "EmpleadoVendedor [nombre=" + nombre + ", apellido=" + apellido + ", idEmpleado=" + idEmpleado
					+ ", salarioBase=" + salarioBase + "]";
		}else {
		return "EmpleadoAbstract [nombre=" + nombre + ", apellido=" + apellido + ", idEmpleado=" + idEmpleado
				+ ", salarioBase=" + salarioBase + "]";
	}
}
	
	/*metodo abstracto que todas las clases deben implementar para calcular salario*/
	
	public abstract double calcularSalario();
	
	
}
