package tema4;

public class Television extends Electrodomestico {

	private final static int RESOLUCION_BASE=60;
	
	private int iResolucion;
	public Television() {
		this(RESOLUCION_BASE);
	}
	
	public Television (int paramResolucion) {
		super(MODELO_BASE,PRECIO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
		this.iResolucion = paramResolucion;
	}
	public double consumoAnual() {
		double consumo= super.ConsumoAnual();
		if (this.iResolucion>50) {
			consumo+=30;
		}
		return consumo;
	}
}
