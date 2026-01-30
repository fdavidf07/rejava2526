package rfef;

public class EquipoFutbolTestDavid {

    public static void main(String[] args) {
    	//Equipo Inventado 
        EquipoFutbolDavid equipo = new EquipoFutbolDavid(
            "San viator", "Madrid", "Enernesto Cotoruelo", "1965-09-15",
            new EntrenadorDavid("Pedro", 50, 12, 15),
            new PorteroDavid("Adrian Herrero", 16, 31),
            new DefensaDavid("David Fernandez", 18, 5),
            new DefensaDavid("Millan bellido", 17, 4),
            new DefensaDavid("Miguel Traviesa", 18, 5),
            new DefensaDavid("Angel Pozo", 18, 8),
            new CentrocampistaDavid("Diego Navarro", 18, 25),
            new CentrocampistaDavid("Martin Barroso", 16, 18),
            new CentrocampistaDavid("Eder", 17, 12),
            new DelanteroDavid("Carlos Canorea", 18, 25),
            new DelanteroDavid("Victor Morillas", 18,40),
            new DelanteroDavid("Victor Clack", 17, 16)
        );
        // Datos principales del eqquipo
        System.out.println("Datos del equipo:");
        System.out.println("Nombre: " + equipo.nombreEquipo);
        System.out.println("Ciudad: " + equipo.ciudad);
        System.out.println("Campo: " + equipo.nombreCampo);
        System.out.println("Fundación: " + equipo.fechaFundacion);
        System.out.println("Entrenador: " + equipo.entrenador);
        System.out.println("Portero: " + equipo.porteroTitular);
        System.out.println("Defensas:");
        System.out.println("  Central 1: " + equipo.central1);
        System.out.println("  Central 2: " + equipo.central2);
        System.out.println("  Interior Izq: " + equipo.interiorIzq);
        System.out.println("  Interior Dcha: " + equipo.interiorDcha);
        System.out.println("Centrocampistas:");
        System.out.println("  1: " + equipo.centrocampista1);
        System.out.println("  2: " + equipo.centrocampista2);
        System.out.println("  3: " + equipo.centrocampista3);
        System.out.println("Delanteros:");
        System.out.println("  Extremo Izq: " + equipo.extremoIzq);
        System.out.println("  Extremo Dcha: " + equipo.extremoDcha);
        System.out.println("  Delantero Centro: " + equipo.delanteroCentro);
        System.out.println("Puntos del equipo: " + equipo.puntosEquipo);
    }
}
