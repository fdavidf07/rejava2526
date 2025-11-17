package rfef;

public class CentrocampistaDavid {

    public String nombre;
    public int edad;
    public int numAsistencias;

    public CentrocampistaDavid(String nombre, int edad, int numAsistencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.numAsistencias = numAsistencias;
    }

    public String toString() {
        return "Centrocampista{nombre='" + nombre + "', edad=" + edad + ", numAsistencias=" + numAsistencias + "}";
    }
}
