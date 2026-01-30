package rfef;

public class DefensaDavid {

    public String nombre;
    public int edad;
    public int penaltisCometidos;

    public DefensaDavid(String nombre, int edad, int penaltisCometidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.penaltisCometidos = penaltisCometidos;
    }

    public String toString() {
        return "Defensa{nombre='" + nombre + "', edad=" + edad + ", penaltisCometidos=" + penaltisCometidos + "}";
    }
}
