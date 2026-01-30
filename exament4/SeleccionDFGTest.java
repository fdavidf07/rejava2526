package exament4;

public class SeleccionDFGTest {
public static void main(String[] args) {
// TODO Auto-generated method stub
// --- 1. Creación de Objetos ---
EntrenadorDFG entrenador = new EntrenadorDFG ("Pedro", "Martinez", 12, 48);
jugadorDFG jugador1 = new jugadorDFG ("Juan", "Garcia", 3, 24);
jugadorDFG jugador2= new jugadorDFG ("David", "Perares",3,28);
MasajistaDFG masajista = new MasajistaDFG ("Maria","Carrasco",5,36);
System.out.println("=== 1. TODOS SE CONCENTRAN Y VIAJAN ===");

//Entrenador
System.out.print("Entrenador: "+entrenador);
entrenador.concentrarse();
entrenador.viajar();
//Jugadores
System.out.print("Jugador: "+jugador1);
jugador1.concentrarse();
jugador1.viajar();
System.out.print("Jugador: "+jugador2);
jugador2.concentrarse();
jugador2.viajar();
//Masajista
System.out.print("Masajista: "+masajista);
masajista.concentrarse();
masajista.viajar();


System.out.println("\n=== 2. TAREAS ESPECÍFICAS  ===");
System.out.println("Entrenador: ");
entrenador.dirigirEntrenamiento();
entrenador.dirigirPartido();

System.out.println("Jugador1: ");
jugador1.entrenar();
jugador1.jugarPartido();

System.out.println("Jugador2: ");
jugador2.entrenar();
jugador2.jugarPartido();
System.out.println("Masajista: ");
masajista.darMasaje();
System.out.println("-------------------");
}
}