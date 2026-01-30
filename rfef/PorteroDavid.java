package rfef;

public class PorteroDavid {
	
    public String nombre;
    public int edad;
    public int golesRecibidos;

    public PorteroDavid(String nombre, int edad, int golesRecibidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.golesRecibidos = golesRecibidos;
    }

    public String toString() {
        return "Portero{nombre='" + nombre + "', edad=" + edad + ", golesRecibidos=" + golesRecibidos + "}";
    }
}
