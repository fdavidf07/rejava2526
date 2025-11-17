package rfef;
public class DelanteroDavid {
	
    public String nombre;
    public int edad;
    public int golesAnotados;

    public DelanteroDavid(String nombre, int edad, int golesAnotados) {
        this.nombre = nombre;
        this.edad = edad;
        this.golesAnotados = golesAnotados;
    }

    public String toString() {
        return "Delantero{nombre='" + nombre + "', edad=" + edad + ", golesAnotados=" + golesAnotados + "}";
    }
}
