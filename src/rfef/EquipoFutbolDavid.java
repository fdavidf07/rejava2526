package rfef;

public class EquipoFutbolDavid {

    public String nombreEquipo, ciudad, nombreCampo, fechaFundacion;
    public EntrenadorDavid entrenador;
    public PorteroDavid porteroTitular;
    public DefensaDavid central1, central2, interiorIzq, interiorDcha;
    public CentrocampistaDavid centrocampista1, centrocampista2, centrocampista3;
    public DelanteroDavid extremoIzq, extremoDcha, delanteroCentro;
    public int puntosEquipo = 0;

    public EquipoFutbolDavid(String nombreEquipo, String ciudad, String nombreCampo, String fechaFundacion,
        EntrenadorDavid entrenador, PorteroDavid porteroTitular, DefensaDavid central1, DefensaDavid central2,
        DefensaDavid interiorIzq, DefensaDavid interiorDcha, CentrocampistaDavid centrocampista1,
        CentrocampistaDavid centrocampista2, CentrocampistaDavid centrocampista3,
        DelanteroDavid extremoIzq, DelanteroDavid extremoDcha, DelanteroDavid delanteroCentro) {

        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.nombreCampo = nombreCampo;
        this.fechaFundacion = fechaFundacion;
        this.entrenador = entrenador;
        this.porteroTitular = porteroTitular;
        this.central1 = central1;
        this.central2 = central2;
        this.interiorIzq = interiorIzq;
        this.interiorDcha = interiorDcha;
        this.centrocampista1 = centrocampista1;
        this.centrocampista2 = centrocampista2;
        this.centrocampista3 = centrocampista3;
        this.extremoIzq = extremoIzq;
        this.extremoDcha = extremoDcha;
        this.delanteroCentro = delanteroCentro;
    }

    public void sumarPuntos(int puntos) {
        puntosEquipo += puntos;
    }

    public String toString() {
        return nombreEquipo + " tiene: " + puntosEquipo + " puntos";
    }
}
