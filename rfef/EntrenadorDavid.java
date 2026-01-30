package rfef;
public class EntrenadorDavid {
    public String nombre;
    public int edad;
    public int añosExperiencia;
    public int titulos;

    public EntrenadorDavid(String nombre, int edad, int añosExperiencia, int titulos) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosExperiencia = añosExperiencia;
        this.titulos = titulos;
    }

    public String toString() {
        return "Entrenador { Nombre='" + nombre + "', edad=" + edad + ", añosExperiencia=" + añosExperiencia + ", títulos=" + titulos + "}";
    }
}

