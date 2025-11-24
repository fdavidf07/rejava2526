package tema4;

public class Electrodomestico {

	protected static final String MODELO_BASE="7200",COLOR_BASE="gris";
	protected static final double PRECIO_BASE=400, POTENCIA_BASE=2300,PRECIO_ENERGIA_BASE=0.4039;
	protected static final int HORAS_BASE= 1,DIAS_BASE=3;
	public enum MARCA_BASE{
		Bosh, Samsung, LG, Whirpol, Siemens
	}
	
	private String sModel, sMarca,sColor;
	protected int iDias,iHoras;
	protected double dPrecioEnergia;
	private double dPotencia,dPrecioElectrodom;
		
	//por defecto
	public Electrodomestico() {
		
		this(MODELO_BASE,PRECIO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	}
	
	public Electrodomestico(String modelo, double precio,String color, double potencia, int horas,int dias,
			double preEner) {
		super();
		this.sModel = modelo;
		this.iDias = dias;
		this.dPrecioEnergia = precio;
		this.dPotencia = potencia;
		this.iHoras = horas;
		this.dPrecioElectrodom = preEner;
	}
	
	public Electrodomestico(String paramModelo, double paramPrecio) {
		this(paramModelo,paramPrecio,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	}



	public double ConsumoAnual() {
		double HorasAnyo= this.iHoras*this.iDias*52;// 7 dias semanales 52 semanas al año
		// horas * potencia entre 1000 * preEner
		return (HorasAnyo *(this.dPotencia/1000)* this.dPrecioElectrodom);
	}

	
	@Override
	public String toString() {
		return "Electrodomestico [sModel=" + sModel + ", sMarca=" + sMarca + ", iDias=" + iDias + ", iHoras=" + iHoras
				+ ", dPrecioEnergia=" + dPrecioEnergia + ", dPotencia=" + dPotencia + ", dPrecioElectrodom="
				+ dPrecioElectrodom + "]";
	}
	
	
	}

