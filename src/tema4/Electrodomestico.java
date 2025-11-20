package tema4;

public class Electrodomestico {

	String modelo, marca;
	int dias;
	double precio,potencia,horas,preEner;
	
	public Electrodomestico() {
		this.modelo = "7200";
		this.marca = "bosh";
		this.dias = 3;
		this.precio = 400;
		this.potencia = 2300;
		this.horas = 1;
		this.preEner = 0.4039;
	}
	
	public Electrodomestico(String modelo, String marca, int dias, double precio, double potencia, double horas,
			double preEner) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.dias = dias;
		this.precio = precio;
		this.potencia = potencia;
		this.horas = horas;
		this.preEner = preEner;
	}
	
	public Electrodomestico(String modelo, String marca, double precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}



	public double ConsumoAnual() {
		double HorasAnyo= this.horas*7*52;// 7 dias semanales 52 semanas al año
		double Consumo;
		// horas * potencia entre 1000 * preEner
		Consumo=(HorasAnyo *(this.potencia/1000)* this.preEner);
		return Consumo;
	}
	
	}

