package rfef;

public class LigaTestDavid {

    public static void main(String[] args) {
        // Crear 4 equipos con datos ficticios
        EquipoFutbolDavid equipo1 = crearEquipo("San Viator");
        EquipoFutbolDavid equipo2 = crearEquipo("Escuela Carabanchel");
        EquipoFutbolDavid equipo3 = crearEquipo("Madrid Rio");
        EquipoFutbolDavid equipo4 = crearEquipo("Barrio Goya");

        LigaDavid liga = new LigaDavid(equipo1, equipo2, equipo3, equipo4);
        System.out.println("\n *** Empieza la liga ***** ");
        liga.simularPartido(equipo1, equipo2);
        liga.simularPartido(equipo1, equipo3);
        liga.simularPartido(equipo1, equipo4);
        liga.simularPartido(equipo2, equipo3);
        liga.simularPartido(equipo2, equipo4);
        liga.simularPartido(equipo3, equipo4);

        System.out.println("\n *** Puntos tras la primera vuelta: ***** ");
        liga.listarPuntos();
        liga.mostrarPremioZamora();
        liga.mostrarPremioPichichi();
    }
    public static EquipoFutbolDavid crearEquipo(String nombre) {
        return new EquipoFutbolDavid(nombre, "Ciudad", "Campo", "1965-09-15",
            new EntrenadorDavid("Entrenador", 50, 12, 15),
            new PorteroDavid("Portero", 16, 31),
            new DefensaDavid("Central1", 18, 5),
            new DefensaDavid("Central2", 17, 4),
            new DefensaDavid("Izq", 18, 5),
            new DefensaDavid("Dcha", 18, 8),
            new CentrocampistaDavid("Medio1", 18, 25),
            new CentrocampistaDavid("Medio2", 16, 18),
            new CentrocampistaDavid("Medio3", 17, 12),
            new DelanteroDavid("ExtIzq", 18, 25),
            new DelanteroDavid("ExtDcha", 18,40),
            new DelanteroDavid("Centro", 17, 16));
    }
}
