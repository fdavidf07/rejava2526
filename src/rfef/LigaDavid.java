package rfef;

import java.util.Random;
public class LigaDavid {
	
    EquipoFutbolDavid[] equipos;
    public LigaDavid(EquipoFutbolDavid... equipos) {
        this.equipos = equipos;
    }

    public void simularPartido(EquipoFutbolDavid e1, EquipoFutbolDavid e2) {
        Random rand = new Random();
        int goles1 = rand.nextInt(5);
        int goles2 = rand.nextInt(5);
        System.out.println(e1.nombreEquipo + " " + goles1 + " - " + goles2 + " " + e2.nombreEquipo);

        if (goles1 > goles2) e1.sumarPuntos(3);
        else if (goles2 > goles1) e2.sumarPuntos(3);
        else {
            e1.sumarPuntos(1);
            e2.sumarPuntos(1);
        }
    }

    public void listarPuntos() {
        EquipoFutbolDavid e1 = equipos[0];
        EquipoFutbolDavid e2 = equipos[1];
        EquipoFutbolDavid e3 = equipos[2];
        EquipoFutbolDavid e4 = equipos[3];
        // Comparaciones aleatorias para ordenar
        EquipoFutbolDavid primero = e1;
        EquipoFutbolDavid segundo = e2;
        EquipoFutbolDavid tercero = e3;
        EquipoFutbolDavid cuarto = e4;
        // If para ordenar por orden de Campeon a Ultimo
        if (segundo.puntosEquipo > primero.puntosEquipo) {
            EquipoFutbolDavid temp = primero;
            primero = segundo;
            segundo = temp;}
        if (tercero.puntosEquipo > primero.puntosEquipo) {
            EquipoFutbolDavid temp = primero;
            primero = tercero;
            tercero = temp;}
        if (cuarto.puntosEquipo > primero.puntosEquipo) {
            EquipoFutbolDavid temp = primero;
            primero = cuarto;
            cuarto = temp;}
        if (tercero.puntosEquipo > segundo.puntosEquipo) {
            EquipoFutbolDavid temp = segundo;
            segundo = tercero;
            tercero = temp;}
        if (cuarto.puntosEquipo > segundo.puntosEquipo) {
            EquipoFutbolDavid temp = segundo;
            segundo = cuarto;
            cuarto = temp;}

        if (cuarto.puntosEquipo > tercero.puntosEquipo) {
            EquipoFutbolDavid temp = tercero;
            tercero = cuarto;
            cuarto = temp;}
        // Mostrar clasificación
        System.out.println(primero.nombreEquipo + " tiene: " + primero.puntosEquipo + " puntos");
        System.out.println(segundo.nombreEquipo + " tiene: " + segundo.puntosEquipo + " puntos");
        System.out.println(tercero.nombreEquipo + " tiene: " + tercero.puntosEquipo + " puntos");
        System.out.println(cuarto.nombreEquipo + " tiene: " + cuarto.puntosEquipo + " puntos");
    }
    public void mostrarPremioZamora() {
        PorteroDavid mejorPortero = null;
        String equipoMejorPortero = "";

        for (EquipoFutbolDavid equipo : equipos) {
            PorteroDavid portero = equipo.porteroTitular;
            if (mejorPortero == null || portero.golesRecibidos < mejorPortero.golesRecibidos) {
                mejorPortero = portero;
                equipoMejorPortero = equipo.nombreEquipo;
            }
        }

        System.out.println("\n Premio Zamora:");
        System.out.println(mejorPortero.nombre + equipoMejorPortero);
    }
    public void mostrarPremioPichichi() {
        DelanteroDavid maxGoleador = null;
        String equipoMaxGoleador = "";

        for (EquipoFutbolDavid equipo : equipos) {
            DelanteroDavid[] delanteros = {
                equipo.extremoIzq, equipo.extremoDcha, equipo.delanteroCentro
            };

            for (DelanteroDavid d : delanteros) {
                if (maxGoleador == null || d.golesAnotados > maxGoleador.golesAnotados) {
                    maxGoleador = d;
                    equipoMaxGoleador = equipo.nombreEquipo;
                }
            }
        }
        System.out.println("\n Premio Pichichi:");
        System.out.println(maxGoleador.nombre + equipoMaxGoleador);
    }

}
